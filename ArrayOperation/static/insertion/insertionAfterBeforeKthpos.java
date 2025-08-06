package insertion;

import java.util.Scanner;

public class insertionAfterBeforeKthpos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter value to insert: ");
        int value = input.nextInt();

        System.out.print("Insert After(1) or Before(0): ");
        int afbefore = input.nextInt();

        System.out.print("Enter position (0-based index): ");
        int pos = input.nextInt();

        int insertionIndex = (afbefore == 1) ? pos + 1 : pos;

        if (insertionIndex < 0 || insertionIndex > size) {
            System.out.println("Invalid position");
            return;
        }

        int[] newArr = new int[size + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == insertionIndex) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }

        System.out.println("Optimized Insertion Result:");
        for (int val : newArr) {
            System.out.print(val + " ");
        }
    }
}
