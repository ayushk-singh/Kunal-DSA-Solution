package firstJava;

import java.util.Scanner;

public class GreetName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.println("");
        System.out.println("Hello "+ name);

    }
}
