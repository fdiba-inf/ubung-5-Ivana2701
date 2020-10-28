package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];
        int[] uniqueNumbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        
        
      

        // Find unique numbers in numbers
        for(int j = 0; j < uniqueNumbers.length; j++){
          if(uniqueNumbers[j] == 0){
              uniqueNumbers[j] = numbers [index];
              break;
          }
          else if(numbers[index] == uniqueNumbers[j]){
              break;
          }
         }
        }

        String uniqueNumsAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumsAsString);
    }
}
