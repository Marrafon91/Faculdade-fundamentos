import estoque.Loja;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Loja loja = new Loja();

        System.out.print("Cliente premium ? (s/n)");
        String resposta = sc.next();

        while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
            System.out.print("Resposta inválida, digite (s/n): ");
            resposta = sc.next();
        }

        boolean premiun = resposta.equalsIgnoreCase("s");
        loja.setClientePremiun(premiun);

        System.out.print("Digite o valor da compra: ");
        double valorDaCompra = sc.nextDouble();
        loja.setCompra(valorDaCompra);

        loja.compraDesconto();

        System.out.println("Desconto aplicado: " + (loja.getDesconto() * 100) + "%");
        System.out.printf("Valor final da compra: R$ %.2f%n", loja.valorTotal());

        sc.close();
    }
}