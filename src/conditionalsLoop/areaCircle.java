package conditionalsLoop;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int radius = input.nextInt();

        double area = (Math.PI * (Math.pow(radius,2)));

        System.out.println(area);
    }
}
