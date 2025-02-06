package sql;

import java.sql.*;
import java.util.Scanner;

public class MenuDrivenProgram {
    public static final String url = "jdbc:mysql://localhost:3306/tech_db?useSSL=false";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","tiger");
            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select a Row");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        insertRow(con, sc);
                        break;
                    case 2:
                        updateRow(con, sc);
                        break;
                    case 3:
                        deleteRow(con, sc);
                        break;
                    case 4:
                        selectRow(con, sc);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        sc.close();
                        con.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertRow(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            String query = "INSERT INTO employee (empid, empname, empsalary) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, empId);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Row inserted successfully.");
            } else {
                System.out.println("Insertion failed.");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateRow(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Employee ID to update: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new Employee Name: ");
            String newName = sc.nextLine();

            System.out.print("Enter new Employee Salary: ");
            int newSalary = sc.nextInt();

            String query = "UPDATE employee SET empname = ?, empsalary = ? WHERE empid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, newSalary);
            ps.setInt(3, empId);

            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Row updated successfully.");
            } else {
                System.out.println("Update failed. Employee ID not found.");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteRow(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Employee ID to delete: ");
            int empId = sc.nextInt();

            String query = "DELETE FROM employee WHERE empid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, empId);

            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Row deleted successfully.");
            } else {
                System.out.println("Deletion failed. Employee ID not found.");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectRow(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Employee ID to search: ");
            int empId = sc.nextInt();

            String query = "SELECT * FROM employee WHERE empid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, empId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("\nEmployee Details:");
                System.out.println("ID: " + rs.getInt("empid"));
                System.out.println("Name: " + rs.getString("empname"));
                System.out.println("Salary: " + rs.getDouble("empsalary"));
            } else {
                System.out.println("No record found for Employee ID: " + empId);
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
