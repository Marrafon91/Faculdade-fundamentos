package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco, total = 0.0;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = 4.00;
            total = preco * quantidade;
        } else if (codigo == 2) {
            preco = 4.50;
            total = preco * quantidade;
        } else if (codigo == 3) {
            preco = 5.00;
            total = preco * quantidade;
        } else if (codigo == 4) {
            preco = 2.00;
            total = preco * quantidade;
        }  else if (codigo == 5) {
            preco = 1.50;
            total = preco * quantidade;
        }

        System.out.printf("Total: R$ %.2f\n", total);
        sc.close();
    }
}
