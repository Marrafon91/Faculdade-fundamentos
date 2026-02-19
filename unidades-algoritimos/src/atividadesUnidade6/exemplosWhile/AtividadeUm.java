package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int cont = 0;
        int tempo = 0;

        System.out.println("Digite numeros validos e -1 para encerrar! ");

        while (tempo != -1) {
            tempo = sc.nextInt();

            if (tempo < 0) {
                continue;
            }
            soma += tempo;
            cont++;
        }

        if (cont == 0) {
            System.out.println("cont=" + cont);
            System.out.println("Nenhum Tempo Valido");
        } else {
            double media = (double) soma / cont;

            System.out.println("cont=" + cont);
            System.out.println("soma=" + soma);
            System.out.println("media=" + (int) media);
        }
        sc.close();
    }
}
