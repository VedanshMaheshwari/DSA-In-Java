import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");


        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("Elements in the ArrayList:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

//        arraylist.add("Vedansh");
//        arraylist.addFirst("Srikrishna");
//        arraylist.addLast("Sunainha");
//        arraylist.add(0,"Saanya");
//        System.out.println(arraylist);

    }
}


