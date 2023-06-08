package firstJava;


import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNum = input.nextFloat();

        System.out.print("Enter second number: ");
        float secondNum = input.nextFloat();

        System.out.println("Select Operation by typing respective numbers: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int operation = input.nextInt();

        if (operation == 1) {
            System.out.println(firstNum + secondNum);
        } else if (operation == 2) {
            System.out.println(firstNum - secondNum);
        } else if (operation == 3) {
            System.out.println(firstNum * secondNum);
        } else if (operation ==4 ) {
            if (secondNum != 0){
                System.out.println(firstNum/secondNum);
            }if (secondNum == 0){
                System.out.println("Can not divide by zero");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
