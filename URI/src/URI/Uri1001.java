package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1001 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}
