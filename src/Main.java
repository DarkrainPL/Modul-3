import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Zadanie1 obiektZadanie1 = new Zadanie1();
        // obiektZadanie1.sumArray();

        // TodoList obiektTodoList = new TodoList();
        // obiektTodoList.start();

        // Zadanie3 obiektZadanie3 = new Zadanie3();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Podaj słowo:");
        // String word = scanner.nextLine();
        // System.out.println(obiektZadanie3.countWords(word));

            List<Student> listOfStudents = new ArrayList<>();
            Student student1 = new Student(20, 180, "John", "Doe");
            Student student2 = new Student(21, 179,"Roger", "Doe");
            Student student3 = new Student(22, 178, "Steven", "Doe");
            Student student4 = new Student(23, 177, "Mike", "Doe");
            Student student5 = new Student(24, 176, "Tony", "Doe");
            listOfStudents.add(student1);
            listOfStudents.add(student2);
            listOfStudents.add(student3);
            listOfStudents.add(student4);
            listOfStudents.add(student5);

            System.out.println("Before Sorting : " + listOfStudents);
            Collections.sort(listOfStudents);
            System.out.println("After Sorting : " + listOfStudents);
        }


    }
