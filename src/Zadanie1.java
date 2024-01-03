

public class Zadanie1 {


    public void sumArray() {


        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            suma = suma + array[i];
        }
        System.out.println("Suma liczb to: " + suma);
    }
}
