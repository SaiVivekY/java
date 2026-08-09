import java.io.*;

public class empdetails {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("employee.txt");

            fw.write("Employee ID : 101\n");
            fw.write("Name : Sai Vivek\n");
            fw.write("Department : CSE\n");
            fw.write("Salary : 50000\n");

            fw.close();

            FileReader fr = new FileReader("employee.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Employee Details:");

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();

        } catch(IOException e){
            System.out.println(e);
        }
    }
}