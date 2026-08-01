import java.util.ArrayList;
import java.util.Scanner;

class Students {

    ArrayList<String> courses = new ArrayList<>();

    // Add course
    void addCourse(String course) {
        courses.add(course);
        System.out.println("Course added successfully");
    }

    // Remove course
    void removeCourse(String course) {
        if(courses.remove(course)) {
            System.out.println("Course removed successfully");
        } else {
            System.out.println("Course not found");
        }
    }

    // View courses using StringBuffer
    void viewCourses() {

        StringBuffer list = new StringBuffer();

        if(courses.size() == 0) {
            System.out.println("No courses registered");
        }
        else {
            for(String course : courses) {
                list.append(course).append("\n");
            }

            System.out.println("Registered Courses:");
            System.out.println(list);
        }
    }
}

public class coursereg {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Students s = new Students();

        int choice;

        do {
            System.out.println("\n1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Courses");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            sc.nextLine(); // clear buffer

            switch(choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    String add = sc.nextLine();
                    s.addCourse(add);
                    break;

                case 2:
                    System.out.print("Enter course to remove: ");
                    String remove = sc.nextLine();
                    s.removeCourse(remove);
                    break;

                case 3:
                    s.viewCourses();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);

        sc.close();
    }
}