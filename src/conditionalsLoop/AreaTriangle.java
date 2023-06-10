package conditionalsLoop;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        float base = input.nextInt();
        System.out.print("Height: ");
        float height = input.nextInt();

        double area = (0.5 * base * height);

        System.out.println(area);

    }
}
