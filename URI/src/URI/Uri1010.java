package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double valorTotal = ((quantidade1 * preco1) + (quantidade2 * preco2));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
