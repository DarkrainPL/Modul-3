import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    ArrayList<String> list = new ArrayList();
    String answer = "y";
    int a;
    public void start() {

        while (!(answer.equals("Q") || answer.equals("q"))) {

            System.out.println(" What would you like to do?");
            System.out.println(" A - add a task to list");
            System.out.println(" L - list tasks");
            System.out.println(" R - remove task from list");
            System.out.println(" Q - quit the program");
            System.out.print(" Your choice:");
            answer = getChoiceFromUser();

            if (answer.equals("A") || answer.equals("a")) {
                addTask();
            } else if (answer.equals("L") || answer.equals("l")) {
                printTasks();
            } else if (answer.equals("R") || answer.equals("r")) {
                removeTask(a);
            } else if (answer.equals("Q") || answer.equals("q")) {

            } else {
                System.out.println("Learn to read!");
            }
        }
    }

    private String getChoiceFromUser() {
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        return task;
    }
    public void addTask() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input task:");
        String input = scanner.nextLine();
        list.add(input);
    }
    public void printTasks() {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
                   }
    }
    public void removeTask(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which task to remove?:");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);
        list.remove(a);
    }

}