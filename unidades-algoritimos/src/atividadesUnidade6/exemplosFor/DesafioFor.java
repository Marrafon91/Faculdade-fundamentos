package atividadesUnidade6.exemplosFor;

import java.util.Locale;
import java.util.Scanner;

public class DesafioFor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de medições: ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. O número deve ser maior que zero.");
            sc.close();
            return;
        }

        double soma = 0.0;
        double maiorValor = Double.NEGATIVE_INFINITY;
        double menorValor = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("Informe o valor %d: ", i);
            double valor = sc.nextDouble();

            soma += valor;

            maiorValor = Math.max(maiorValor, valor);
            menorValor = Math.min(menorValor, valor);
        }

        double media = soma / quantidade;

        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Soma:   %.2f%n", soma);
        System.out.printf("Média:  %.2f%n", media);
        System.out.printf("Maior:  %.2f%n", maiorValor);
        System.out.printf("Menor:  %.2f%n", menorValor);

        sc.close();
    }
}
