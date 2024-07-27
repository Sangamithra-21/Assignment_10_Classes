package Assignment_10_class;

public class Employee {
    int empId;
    String empName;
    static int id=1;
    String role;
    double salary;
    private int aadhar;

    public void displayEmployee()
    {
        System.out.println("Employee Id     : "+empId);
        System.out.println("Employee Name   : "+empName);
        System.out.println("Employee ROle   : "+role);
        System.out.println("Employee Salary : "+salary);
        System.out.println("Aadhar Number   : "+aadhar);
        System.out.println("-------------------------------------------------------");
    }
}
