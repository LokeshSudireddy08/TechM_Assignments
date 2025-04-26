package com.company.ems.service;

import com.company.ems.exception.ResourceNotFoundException;
import com.company.ems.model.Department;
import com.company.ems.model.Employee;
import com.company.ems.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
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
    void getAllEmployees_ShouldReturnAllEmployees() {
        // Arrange
        when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee));

        // Act
        List<Employee> employees = employeeService.getAllEmployees();

        // Assert
        assertEquals(1, employees.size());
        verify(employeeRepository, times(1)).findAll();
    }

    @Test
    void getEmployeeById_WithValidId_ShouldReturnEmployee() {
        // Arrange
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));

        // Act
        Employee foundEmployee = employeeService.getEmployeeById(1L);

        // Assert
        assertNotNull(foundEmployee);
        assertEquals("John", foundEmployee.getFirstName());
        verify(employeeRepository, times(1)).findById(1L);
    }

    @Test
    void getEmployeeById_WithInvalidId_ShouldThrowException() {
        // Arrange
        when(employeeRepository.findById(2L)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(ResourceNotFoundException.class, () -> employeeService.getEmployeeById(2L));
        verify(employeeRepository, times(1)).findById(2L);
    }

    @Test
    void createEmployee_ShouldReturnCreatedEmployee() {
        // Arrange
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        // Act
        Employee createdEmployee = employeeService.createEmployee(employee);

        // Assert
        assertNotNull(createdEmployee);
        assertEquals("John", createdEmployee.getFirstName());
        verify(employeeRepository, times(1)).save(employee);
    }

    @Test
    void updateEmployee_WithValidId_ShouldReturnUpdatedEmployee() {
        // Arrange
        Employee updatedEmployee = new Employee(1L, "Jane", "Doe", "jane.doe@example.com", 
                "0987654321", LocalDate.now(), 60000.0, department);
        
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        when(employeeRepository.save(any(Employee.class))).thenReturn(updatedEmployee);

        // Act
        Employee result = employeeService.updateEmployee(1L, updatedEmployee);

        // Assert
        assertNotNull(result);
        assertEquals("Jane", result.getFirstName());
        assertEquals("jane.doe@example.com", result.getEmail());
        verify(employeeRepository, times(1)).findById(1L);
        verify(employeeRepository, times(1)).save(any(Employee.class));
    }

    @Test
    void deleteEmployee_WithValidId_ShouldDeleteEmployee() {
        // Arrange
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        doNothing().when(employeeRepository).delete(employee);

        // Act
        employeeService.deleteEmployee(1L);

        // Assert
        verify(employeeRepository, times(1)).findById(1L);
        verify(employeeRepository, times(1)).delete(employee);
    }
}
