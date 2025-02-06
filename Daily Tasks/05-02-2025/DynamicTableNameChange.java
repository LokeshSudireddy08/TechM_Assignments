package sql;
import java.sql.*;
import java.util.Scanner;

public class DynamicTableNameChange {
    public static final String URL = "jdbc:mysql://localhost:3306/tech_db?useSSL=false";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new table name: ");
        String newName = sc.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, "root", "tiger");
            String query = "ALTER TABLE toemployee RENAME TO " + newName;
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table renamed successfully!");
            stmt.close();
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
