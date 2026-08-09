
import faculty.Faculty;
import student.Student;

public class CollegeDemo {

    public static void main(String[] args) {

        Student s = new Student(101, "Sai Vivek");
        Faculty f = new Faculty(201, "Dr. Sharma");

        s.display();

        System.out.println();

        f.display();
    }
}
