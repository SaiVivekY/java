import java.io.*;

public class PatientFile {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("patient.txt");

            fw.write("Patient ID : 1001\n");
            fw.write("Name : Rahul\n");
            fw.write("Age : 30\n");
            fw.write("Diagnosis : Fever\n");

            fw.close();

            FileReader fr = new FileReader("patient.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Patient Details:");

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();

        } catch(IOException e){
            System.out.println(e);
        }
    }
}