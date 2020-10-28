package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // Sort numbers in descending order

           Arrays.sort(numbers);
          int[] reversed = new int[numberCount];
              for (int i = numbers.length-1; i >=0; i--){
                reversed[numbers.length-i-1] = numbers[i];
              }
              
    String reversedAsString = Arrays.toString(reversed);
    System.out.println("Sorted numbers: " + reversedAsString);
        

       
    }
}
