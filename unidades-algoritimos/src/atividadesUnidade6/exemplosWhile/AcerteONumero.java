package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class AcerteONumero {

// Ler valores até o usuário digitar -1 para encerrar.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Descubra o numero para encerrar o programa! ");
        numero = sc.nextInt();

        while (numero != -1) {
            System.out.println("Numero errado tente novamente!: ");
            numero = sc.nextInt();
        }

        System.out.println("Parabens!!! voce acertou o numero " + numero);
        sc.close();
    }
}
