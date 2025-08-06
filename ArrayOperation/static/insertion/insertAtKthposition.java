package insertion;

import java.util.Scanner;

public class InsertAtKthPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int[] new_array = new int[size + 1];

        System.out.print("Enter the value of the element you want to add: ");
        int value = input.nextInt();

        System.out.print("Enter the position you want to insert (0-based index): ");
        int pos = input.nextInt();

        if(pos < 0 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }

        for(int i = 0; i < pos; i++) {
            new_array[i] = arr[i];
        }

        new_array[pos] = value;

        for(int i = pos; i < size; i++) {
            new_array[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");
        for(int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }
    }
}
