import java.util.ArrayList;

class todoList {

    public static void main(String args[]) {

        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks to ArrayList
        tasks.add("Complete Java Assignment");
        tasks.add("Study DSA");
        tasks.add("Practice Coding");

        // Using StringBuffer to display tasks
        StringBuffer list = new StringBuffer();

        for(String task : tasks) {
            list.append(task).append("\n");
        }

        System.out.println("To-Do List:");
        System.out.println(list);
    }
}