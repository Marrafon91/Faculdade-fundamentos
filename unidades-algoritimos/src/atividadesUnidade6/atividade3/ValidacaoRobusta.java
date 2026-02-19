package atividadesUnidade6.atividade3;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoRobusta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de amostras: ");
        int amostras = sc.nextInt();

        while (amostras <= 0) {
            System.out.println("A quantidade de amostras deve ser maior que zero.");
            amostras = sc.nextInt();
        }
        double tempo;
        double soma = 0;

        for (int i = 1; i <= amostras; i++) {
            System.out.printf("Informe o tempo da amostra %d (min) ", i);
            tempo = sc.nextDouble();

            while (tempo <= 0) {
                System.out.println("Tempo invalido, informe novamente: ");
                tempo = sc.nextDouble();
            }
            soma += tempo;
        }

        double mediaDeTempo = soma / amostras;

        System.out.println("\n###RESULTADO###");
        System.out.printf("Média de tempo das amostras: %.2f min", mediaDeTempo);

        sc.close();
    }
}
