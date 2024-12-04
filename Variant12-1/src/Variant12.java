public class Variant12 {
    public static void main(String[] args) {
        double a = 3.457;
        double b = 3.1;
        double c = 2;

        double part1 = Math.pow(a - 5, 2); // (a-5)^2
        double part2 = Math.cbrt(Math.pow(b + 1, 2)); // 3√(b+1)^2
        double part3 = Math.log(a); // ln(a)
        double x = part1 * part2 + part3;

        double y = a * Math.exp(-b * c) * Math.sin(c);

        System.out.printf("x = %.4f%n", x);
        System.out.printf("y = %.4f%n", y);
    }
}