package Advance12;

public class Employee {
    private int empId;
    private String empName;
    private int age;

    public Employee(int empId, String empName, int age) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }
}
