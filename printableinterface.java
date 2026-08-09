interface Printable {
    void print();
}

class Studentw implements Printable {

    String name;
    int rollNo;

    Studentw(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void print() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }
}

class Employee implements Printable {

    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void print() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
    }
}

public class printableinterface{
    public static void main(String[] args) {

        Studentw s = new Studentw("Sai Vivek",101);
        Employee e = new Employee("Rahul",201);

        s.print();
        System.out.println();

        e.print();
    }
}