package conditionalsLoop;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        float l = in.nextInt();
        System.out.print("Enter breath: ");
        float b = in.nextInt();

        float area = l * b;

        System.out.println(area);


    }
}
