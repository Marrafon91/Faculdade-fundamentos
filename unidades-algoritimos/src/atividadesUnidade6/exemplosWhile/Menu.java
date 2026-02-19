package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Registrar Tempo");
            System.out.println("2 - Mostrar Relatorio");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Registrando Tempo...");
            } else if (opcao == 2) {
                System.out.println("Mostrando Relatorio...");
            } else if (opcao != 0) {
                System.out.println("Opcao Invalida.");
            }
        } while (opcao != 0);

        System.out.println("Encerrado.");

        sc.close();
    }
}
