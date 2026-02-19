package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class ValoresPH {

    // Pedir um valor de pH e aceitar apenas se estiver entre 0 e 14.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ph;

        System.out.print("Digite um valor de pH (0 a 14): ");
        ph = sc.nextInt();

        while (ph < 0 || ph > 14) {
            System.out.println("Valor inválido! pH deve estar entre 0 e 14.");
            System.out.print("Digite novamente: ");
            ph = sc.nextInt();
        }

        System.out.println("Valor de pH válido: " + ph);
        sc.close();
    }
}
