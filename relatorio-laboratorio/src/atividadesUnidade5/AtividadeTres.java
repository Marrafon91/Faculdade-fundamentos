package atividadesUnidade5;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int escolha;

        System.out.println("Escolha um numero entre: 1 e 3 ");
        escolha = sc.nextInt();

        String mensagem = switch (escolha) {
            case 1 -> "Emergência";
            case 2 -> "Consulta de Rotina";
            case 3 -> "Retirada de Exames";
            default -> "Opção Inválida";
        };
        System.out.print(mensagem);
        sc.close();
    }
}
