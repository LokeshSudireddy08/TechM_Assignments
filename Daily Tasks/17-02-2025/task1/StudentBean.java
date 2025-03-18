package examples;

public class StudentBean {
	private int rollno;
	private  String name;
	private  String collegeName;
	
	// defining the getters and setters 
	
	public int getRollNo()
	{
		return rollno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getcollegeName()
	{
		return collegeName;
	}
	
	public void setRollNo(int rollNo)
	{
		this.rollno = rollNo;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setcollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	
	public void displayValues()
	{
		System.out.println(rollno + " " + name + " " + collegeName);
	}
}
