import java.util.*;
public class emppayroll {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the emplyee id: ");
        String id = scanner.nextLine();
        System.out.println("Enter the base salary: ");
        String sal = scanner.nextLine();
        System.out.println("ENter the bonus amount");
        String bonus = scanner.nextLine();

        int intsal = Integer.parseInt(sal);
        int intbon = Integer.parseInt(bonus);

        int netsal = intsal + intbon;
        System.out.println("the total salary of the employee: " + id + "is : " + netsal);

    }
}
