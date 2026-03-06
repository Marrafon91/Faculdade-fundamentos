package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r1, r2, delta;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        delta = b * b - 4 * a * c;
        r1 = (-b + Math.sqrt(delta)) / (2 * a);
        r2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (Double.isNaN(r1) || Double.isNaN(r2)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
        sc.close();
    }
}
