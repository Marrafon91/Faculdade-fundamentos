package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int valor = (int) Math.round(n * 100);

        int[] dinheiro = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS: ");

        for (int i = 0; i < dinheiro.length; i++) {

            int quantidade = valor / dinheiro[i];
            valor %= dinheiro[i];

            if (i == 6) {
                System.out.println("MOEDAS: ");
            }
            if (i < 6) {
                System.out.printf("%d notas(s) de R$ %.2f%n", quantidade, dinheiro[i] / 100.0);
            } else {
                System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, dinheiro[i] / 100.0);
            }
        }
        sc.close();
    }
}
