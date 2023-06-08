package firstJava;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        float inr = input.nextFloat();

        // 1 INR  is 0.012 USD

        double usd = inr * 0.012;

        System.out.println(inr + " rupees is  "+ usd + " USD");

    }
}
