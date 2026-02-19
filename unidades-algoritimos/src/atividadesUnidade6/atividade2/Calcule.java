package atividadesUnidade6.atividade2;

import java.util.Locale;
import java.util.Scanner;

public class Calcule {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos valores deseja informar? ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Quantidade deve ser maior que zero!");
            System.out.print("Digite novamente: ");
            n = sc.nextInt();
        }

        double soma = 0;
        double valor;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {

            System.out.printf("Valor %d ", i);
            valor = sc.nextDouble();

            soma += valor;

            maior = Math.max(maior, valor);
            menor = Math.min(menor, valor);
        }

        double media = soma / n;

        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Soma   = %.1f%n", soma);
        System.out.printf("Média  = %.1f%n", media);
        System.out.printf("Maior  = %.1f%n", maior);
        System.out.printf("Menor  = %.1f%n", menor);

        sc.close();
    }
}

