package firstJava;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 2;
        System.out.print("Enter value upto which you want fibonacci sequence: ");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(0);
        System.out.println(1);
        while (count < n){
            System.out.println(n1 + n2);
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            count++;
        }
    }
}
