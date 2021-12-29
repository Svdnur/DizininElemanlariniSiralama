import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu :");
        int n = input.nextInt();
        int[] array = new int[n];


        for (int i = 0; i < n; i++) {


            System.out.print("Dizinin " + (i + 1) + ". elemanı :");
            int j = input.nextInt();
            array[i] = j;

        }

        Arrays.sort(array);
        System.out.print("Dizinizin küçükten büyüğe sıralanışı :" + Arrays.toString(array));
    }

}
