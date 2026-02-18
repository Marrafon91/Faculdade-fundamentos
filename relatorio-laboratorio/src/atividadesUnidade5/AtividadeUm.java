package atividadesUnidade5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Double> totalDeCompras = new ArrayList<>();

        double valorDaCompra, valorComDesconto, soma;
        String resposta;

        while (true) {

            System.out.print("Vamos fazer uma compra (s/n)? ");
            resposta = sc.next().trim();

            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Obrigado pela visita! Volte sempre.");
                break;
            }

            if (!resposta.equalsIgnoreCase("s")) {
                System.out.println("Resposta inválida. Digite apenas s ou n.");
                continue;
            }

            System.out.print("Digite o valor da compra: ");
            valorDaCompra = sc.nextDouble();

            if (valorDaCompra >= 500) {
                valorComDesconto = valorDaCompra * 0.80;
                System.out.printf("Desconto de 20%% aplicado. Valor a pagar: %.2f R$%n", valorComDesconto);

            } else if (valorDaCompra >= 200) {
                valorComDesconto = valorDaCompra * 0.90;
                System.out.printf("Desconto de 10%% aplicado. Valor a pagar: %.2f R$%n", valorComDesconto);

            } else {
                valorComDesconto = valorDaCompra;
                System.out.printf("Desconto de 0%% aplicado. Valor a pagar: %.2f R$%n", valorComDesconto);
            }

            totalDeCompras.add(valorComDesconto);
        }

        soma = totalDeCompras.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.printf("Total gasto nas compras com desconto: %.2f R$%n", soma);

        sc.close();
    }
}
