package sql;
import java.sql.*;
import java.util.Scanner;

public class dynamicinsert{
	public static final String url="jdbc:mysql://localhost:3306/tech_db?useSSL=false";
	public static void main(String args[])  throws SQLException,Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int empid=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String empname=sc.next();
		System.out.println("Enter Employee Salary:");
		int empsalary=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,"root","tiger");
		PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1,empid);
		pst.setString(2,empname);
		pst.setInt(3, empsalary);
		int value=pst.executeUpdate();
		if(value>0) System.out.println(value+"inserted");
		pst.close();
		sc.close();
		con.close();
	}
}
