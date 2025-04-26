package com.company.ems.controller;

import com.company.ems.model.Department;
import com.company.ems.model.Employee;
import com.company.ems.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private EmployeeService employeeService;

    private Employee employee;
    private Department department;

    @BeforeEach
    void setUp() {
        department = new Department(1L, "IT", "Information Technology", null);
        employee = new Employee(1L, "John", "Doe", "john.doe@example.com", "1234567890", 
                LocalDate.now(), 50000.0, department);
    }

    @Test
    @WithMockUser
    void getAllEmployees_ShouldReturnAllEmployees() throws Exception {
        // Arrange
        when(employeeService.getAllEmployees()).thenReturn(Arrays.asList(employee));

        // Act & Assert
        mockMvc.perform(get("/api/employees"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].firstName", is("John")));

        verify(employeeService, times(1)).getAllEmployees();
    }

    @Test
    @WithMockUser
    void getEmployeeById_WithValidId_ShouldReturnEmployee() throws Exception {
        // Arrange
        when(employeeService.getEmployeeById(1L)).thenReturn(employee);

        // Act & Assert
        mockMvc.perform(get("/api/employees/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.firstName", is("John")))
                .andExpect(jsonPath("$.email", is("john.doe@example.com")));

        verify(employeeService, times(1)).getEmployeeById(1L);
    }

    @Test
    @WithMockUser
    void createEmployee_ShouldReturnCreatedEmployee() throws Exception {
        // Arrange
        when(employeeService.createEmployee(any(Employee.class))).thenReturn(employee);

        // Act & Assert
        mockMvc.perform(post("/api/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.firstName", is("John")))
                .andExpect(jsonPath("$.email", is("john.doe@example.com")));

        verify(employeeService, times(1)).createEmployee(any(Employee.class));
    }

    @Test
    @WithMockUser
    void updateEmployee_WithValidId_ShouldReturnUpdatedEmployee() throws Exception {
        // Arrange
        Employee updatedEmployee = new Employee(1L, "Jane", "Doe", "jane.doe@example.com", 
                "0987654321", LocalDate.now(), 60000.0, department);
        
        when(employeeService.updateEmployee(eq(1L), any(Employee.class))).thenReturn(updatedEmployee);

        // Act & Assert
        mockMvc.perform(put("/api/employees/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updatedEmployee)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName", is("Jane")))
                .andExpect(jsonPath("$.email", is("jane.doe@example.com")));

        verify(employeeService, times(1)).updateEmployee(eq(1L), any(Employee.class));
    }

    @Test
    @WithMockUser
    void deleteEmployee_WithValidId_ShouldReturnNoContent() throws Exception {
        // Arrange
        doNothing().when(employeeService).deleteEmployee(1L);

        // Act & Assert
        mockMvc.perform(delete("/api/employees/1"))
                .andExpect(status().isNoContent());

        verify(employeeService, times(1)).deleteEmployee(1L);
    }
}
