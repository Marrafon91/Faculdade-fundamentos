package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class LoopAninhado {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (int turno = 1; turno <= 2; turno++) {
            System.out.print("Quantidade De Amostras Do Turno " + turno + ": ");
            int n = sc.nextInt();

            double soma = 0.0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Tempo Da Amostra " + i + ": ");
                double tempo = sc.nextDouble();
                soma += tempo;
            }

            double mediaTurno = soma / n;
            System.out.println("Media Do Turno " + turno + ": " + String.format("%.2f", mediaTurno));
        }
    }
}
