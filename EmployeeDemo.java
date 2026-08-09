class Employees {

    String name = "Sai Vivek";
    int empId = 101;

    Employee() {
        System.out.println("Employee Constructor Called");
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
    }
}

class Manager extends Employees {

    String department = "IT";

    Manager() {
        super(); // Calls Employee constructor
    }

    void showDetails() {
        super.display(); // Calls Employee display method
        System.out.println("Department    : " + department);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.showDetails();

    }
}