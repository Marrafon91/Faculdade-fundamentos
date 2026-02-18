package atividadesUnidade5;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha um numero entre: 1 e 3 ");
        opcao = sc.nextInt();

        String mensagem = switch (opcao) {
            case 1 -> "Encaminhando para Emergência";
            case 2 -> "Agendando Consulta de Rotina";
            case 3 -> "Preparando Retirada de Exames";
            default -> "Opção Inválida";
        };
        System.out.print(mensagem);
        sc.close();
    }
}
