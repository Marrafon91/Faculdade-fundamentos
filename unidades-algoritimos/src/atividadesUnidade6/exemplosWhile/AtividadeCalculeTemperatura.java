package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeCalculeTemperatura {

//    Ler exatamente 12 temperaturas e calcular a média.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temperatura;
        double soma = 0;

        System.out.println("Digite 12 temperaturas:");

        for (int i = 1; i <= 12; i++) {
            System.out.printf("Temperatura %d: ", i);
            temperatura = sc.nextDouble();
            soma += temperatura;
        }
        double media = soma / 12;

        System.out.printf("Media = %.2f%n", media);

        sc.close();
    }
}
