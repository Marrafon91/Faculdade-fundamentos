package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class Tentativas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double soma = 0.0;
        int cont = 0;

        System.out.println("Digite Tempos Em Minutos. Digite -1 Para Encerrar.");

        double tempo = sc.nextDouble();

        while (tempo != -1) {
            if (tempo >= 0) {
                soma += tempo;
                cont++;
            } else {
                System.out.println("Valor Negativo Ignorado (Exceto -1 Para Encerrar).");
            }
            tempo = sc.nextDouble();
        }

        double media = soma / cont;

        if (cont > 0) {
            System.out.println("Media: " + String.format("%.2f", media));
        } else {
            System.out.println("Nenhum Tempo Valido Foi Informado.");
        }
        sc.close();
    }
}
