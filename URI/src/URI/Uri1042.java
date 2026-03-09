package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1042 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int menor, meio, maior;

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        meio = n1 + n2 + n3 -  menor - maior;

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        sc.close();
    }
}