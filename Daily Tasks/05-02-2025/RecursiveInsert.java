package sql;

import java.sql.*;
import java.util.Scanner;

public class RecursiveInsert {
    public static final String url = "jdbc:mysql://localhost:3306/tech_db?useSSL=false";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table name: ");
        String tableName = sc.next();
        System.out.print("Enter number of rows to insert: ");
        int rows = sc.nextInt();
        insertRowsRecursively(tableName, rows, sc);
    }

    public static void insertRowsRecursively(String tableName, int remainingRows, Scanner sc) {
        if (remainingRows <= 0) {
            System.out.println("All rows inserted successfully.");
            return;
        }
        else System.out.println("enter employee details");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","tiger");
            String query = "INSERT INTO " + tableName + " (empid, empname, empsalary) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            int salary = sc.nextInt();
            ps.setInt(1, empId);
            ps.setString(2, name);
            ps.setDouble(3, salary);
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Row inserted successfully.");
            } else {
                System.out.println("Failed to insert row.");
            }
            ps.close();
            con.close();
            insertRowsRecursively(tableName, remainingRows - 1, sc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
