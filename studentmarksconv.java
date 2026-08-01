class studentmarksconv{

    public static void main(String args[]) {

        // Marks stored as String
        String mark1 = "85";
        String mark2 = "90";
        String mark3 = "75";

        // Converting String to Integer using wrapper class
        Integer m1 = Integer.parseInt(mark1);
        Integer m2 = Integer.parseInt(mark2);
        Integer m3 = Integer.parseInt(mark3);

        // Calculating total marks
        int total = m1 + m2 + m3;

        System.out.println("Mark 1: " + m1);
        System.out.println("Mark 2: " + m2);
        System.out.println("Mark 3: " + m3);
        System.out.println("Total Marks: " + total);
    }
}