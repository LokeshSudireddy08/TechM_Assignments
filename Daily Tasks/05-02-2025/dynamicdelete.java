package sql;
import java.sql.*;
import java.util.Scanner;
public class dynamicdelete {
	public static final String url="jdbc:mysql://localhost:3306/tech_db?useSSL=false";
	public static void main(String[] args) throws SQLException,Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter table name");
		String tablename=sc.next();
		System.out.println("enter condition");
		int num=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,"root","tiger");
		String query="DELETE from "+tablename+" where empid=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, num);
		int result=ps.executeUpdate();
		if(result>0) System.out.println("done");
	}
}
