package firstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principal = input.nextInt();
        System.out.print("Enter annual interest rate: ");
        int rate = input.nextInt();
        System.out.print("Enter time in years: ");
        int time = input.nextInt();

        int interest = ((principal *  rate * time)/100);
        int si = interest + principal ;
        System.out.println("Simple Interest is: " + si);

    }
}
