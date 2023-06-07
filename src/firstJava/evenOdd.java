
// Write a program to print whether a number is even or odd, also take input from the user.

package firstJava;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd: ");
        int number = input.nextInt();

        if (number%2 == 0) {
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }

    }
}
