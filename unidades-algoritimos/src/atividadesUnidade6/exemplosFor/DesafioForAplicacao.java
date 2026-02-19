package atividadesUnidade6.exemplosFor;

import java.util.Locale;
import java.util.Scanner;

public class DesafioForAplicacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de Atendimentos: ");
        int atendimentos = sc.nextInt();

        if (atendimentos <= 0) {
            System.out.println("Atendimentos inválida. O número deve ser maior que zero.");
            sc.close();
            return;
        }

        double soma = 0.0;
        double maiorTempo = Double.NEGATIVE_INFINITY;
        double menorTempo = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= atendimentos; i++) {
            System.out.printf("Tempo do Atendimento %d (min): ", i);
            double tempo = sc.nextDouble();

            soma += tempo;

            maiorTempo = Math.max(maiorTempo, tempo);
            menorTempo = Math.min(menorTempo, tempo);
        }

        double media = soma / atendimentos;

        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Soma:   %.1f%n", soma);
        System.out.printf("Média:  %.1f%n", media);
        System.out.printf("Maior:  %.1f%n", maiorTempo);
        System.out.printf("Menor:  %.1f%n", menorTempo);

        sc.close();
    }
}
