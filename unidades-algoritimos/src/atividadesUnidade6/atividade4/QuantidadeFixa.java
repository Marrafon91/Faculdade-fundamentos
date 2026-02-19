package atividadesUnidade6.atividade4;

import java.util.Locale;
import java.util.Scanner;

public class QuantidadeFixa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int medicao;
        double soma = 0.0;
        int count = 0;

        System.out.println("Total de 10 medições: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Medição: " + i);
            medicao = sc.nextInt();
            soma += medicao;
            count++;
        }

        double media = soma / count;
        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);

        sc.close();
    }
}
