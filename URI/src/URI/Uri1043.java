package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double perimetro = a + b + c;
        double area = ((a + b) * c) / 2.0;


        if (a + b > c && a + c > b && b + c > a) {
        System.out.printf("Perimetro = %.1f%n ", perimetro);
        } else {
        System.out.printf("Area = %.1f%n ", area);
        }
        sc.close();
    }
}