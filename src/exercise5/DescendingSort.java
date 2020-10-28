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
          
              for (int i = 0; i <numbers.length; i++){
                reversed[i] = newArrayt[numbers.length-1-i];
              }
              
    String reversedAsString = Arrays.toString(reversed);
    System.out.println("Reversed symbols: " + reversedAsString);
        

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
