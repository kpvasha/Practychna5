import java.util.Scanner;

public class Variant12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double fx;
        if (x >= 0 && x < 5) {
            fx = 2 * x + 7; // 2x + 7
        } else if (x == 5) {
            fx = 3 * Math.exp(a * x); // 3e^(ax)
        } else if (x > 5 && x < 8) {
            fx = Math.log(b * x + a); // ln(bx + a)
        } else {
            System.out.println("Значення x виходить за межі допустимого діапазону.");
            return;
        }

        System.out.printf("f(x) = %.4f%n", fx);
    }
}