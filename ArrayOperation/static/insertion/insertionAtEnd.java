package insertion;

import java.util.Scanner;

public class insertionAtEnd {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();

    int[] arr = new int[size];

    for(int i=0;i<arr.length;i++){
        arr[i] = input.nextInt();

    }


    int[] new_arr = new int[size+1];
    System.out.println("enter the value you want to enter in the end of the array: ");
    int value = input.nextInt();
    new_arr[size] = value;
 for(int i=0;i<arr.length;i++){
    new_arr[i] = arr[i];
  }

  //printing the values :
  for(int i=0;i<new_arr.length;i++){
System.out.println(new_arr[i]);
  }

}
}
