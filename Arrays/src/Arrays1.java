import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }

        System.out.println(Arrays.toString(array));
    }
}
