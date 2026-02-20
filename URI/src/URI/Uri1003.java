package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1003 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        sc.close();
    }
}
