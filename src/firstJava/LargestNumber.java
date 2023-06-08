package firstJava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " is greater than "+ n2);
        } else if (n1<n2) {
            System.out.println(n1 + " is less than "+ n2);
        } else {
            System.out.println("Both are equal");
        }
    }
}
