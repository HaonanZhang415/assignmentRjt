package homework1214;

public class Member {

    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private float salary;

    public void printSalary() {
        System.out.println(name + "'s salary is" + salary);
    }

    public Member(String name, int age, String phoneNumber, String address, float salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, float salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, float salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

class main0 {

    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", 20, "(999)123-4567", "12 main st, New York, NY", 50000f,"accounting");
        Manager manager = new Manager("Alex Sandra", 30, "(234)999-0987", "34 main ave, New York, NY", 80000f, "accounting department");
        employee.printSalary();
        manager.printSalary();
    }

}