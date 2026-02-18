package atividadesUnidade5;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorDaCompra, desconto, valorFinal;

        System.out.print("Digite o Valor da compra: ");
        valorDaCompra = sc.nextDouble();

        if (valorDaCompra >= 500) {
            desconto = valorDaCompra * 0.80;
            System.out.printf("Desconto de 20%% aplicado, Valor a pagar: %.2f R$.", desconto);
        } else if (valorDaCompra >= 200) {
            desconto = valorDaCompra * 0.90;
            System.out.printf("Desconto de 10%% aplicado, Valor a pagar: %.2f R$.", desconto);
        } else {
            valorFinal = valorDaCompra;
            System.out.printf("Desconto de 0%% aplicado, Valor a pagar: %.2f R$.", valorFinal);
        }
        sc.close();
    }
}
