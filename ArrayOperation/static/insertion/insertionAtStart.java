package insertion;

import java.util.Scanner;

public class insertionAtStart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int[] narr = new int[size + 1];

        System.out.println("Enter the value you want to add in the beginning:");
        int value = input.nextInt();

        narr[0] = value;

        for (int i = 0; i < arr.length; i++) {
            narr[i + 1] = arr[i];
        }

        System.out.println("New array:");
        for (int i = 0; i < narr.length; i++) {
            System.out.println(narr[i]);
        }
    }
}
