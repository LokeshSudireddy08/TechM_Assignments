package sample;

public class Employee{
    private int empId;
    private String empName;
    private double sal;
    private int yearsWorked;

    public Employee(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }
    
    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + sal);
        System.out.println("Years Worked: " + yearsWorked);
    }

    public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }
    
    public void getLoanEligibility() {
        if (yearsWorked > 5) {
            if (sal >= 15_00_000) {
                System.out.println("Loan Eligibility: 7 Lakhs");
            } else if (sal >= 10_00_000) {
                System.out.println("Loan Eligibility: 5 Lakhs");
            } else if (sal >= 6_00_000) {
                System.out.println("Loan Eligibility: 2 Lakhs");
            } else {
                System.out.println("Loan Eligibility: Not eligible for a loan based on salary.");
            }
        } else {
            System.out.println("Loan Eligibility: Not eligible due to insufficient years of work.");
        }
    }

    public static void main(String[] args){
        Employee emp1 = new Employee(101, "John Doe", 12_00_000, 6);
        emp1.getEmployeeDetails();
        emp1.getLoanEligibility();
        Employee emp2 = new Employee(102, "Jane Smith", 5_00_000, 7);
        emp2.getEmployeeDetails();
        emp2.getLoanEligibility();
    }
}
