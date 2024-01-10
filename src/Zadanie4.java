import java.util.ArrayList;
import java.util.List;

public class Zadanie4<Student> {

   int age;
   int height;
   String name;
   String lastName;

    public void Student(int age, int height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;

        List<Student> listaStudentow = new ArrayList<>();
        Student student1 = new Student(20, 180, "John", "Karaszewski");

        listaStudentow.add(student1);
        listaStudentow.add(student2);
        listaStudentow.add(student3);
        listaStudentow.add(student4);
        listaStudentow.add(student5);


    }

}
