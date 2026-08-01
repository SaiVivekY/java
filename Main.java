class Student {

    int rollNo;
    String name;

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Method
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String args[]) {

        // Creating object
        Student s1 = new Student(101, "Vivek");

        // Calling method
        s1.display();
    }
}