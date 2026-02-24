package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int maiorAB, maior;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        maiorAB = (A + B + Math.abs(A - B)) / 2;
        maior = Math.max(maiorAB, C);

        System.out.println(maior + " eh o maior");
        sc.close();
    }
}
