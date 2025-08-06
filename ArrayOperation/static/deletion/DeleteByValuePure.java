import java.util.Scanner;

public class DeleteByValuePure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to delete: ");
        int k = sc.nextInt();

        int newSize = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[newSize++] = arr[i];
            }
        }

        if (newSize == n) {
            System.out.println("Value not found. No deletion performed.");
        } else if (newSize == 0) {
            System.out.println("All values deleted. Array is now empty.");
        } else {
            System.out.println("Array after deleting value " + k + ":");
            for (int i = 0; i < newSize; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
