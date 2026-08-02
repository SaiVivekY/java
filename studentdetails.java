class Studentsu {
    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class studentdetails{
    public static void main(String[] args) {

        // Object using default constructor
        Studentsu s1 = new Studentsu();

        // Object using parameterized constructor
        Studentsu s2 = new Studentsu("Vivek", 101);

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println();

        System.out.println("Student 2 Details:");
        s2.display();
    }
}

