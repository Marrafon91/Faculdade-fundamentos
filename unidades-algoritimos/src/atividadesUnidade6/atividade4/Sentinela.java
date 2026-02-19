package atividadesUnidade6.atividade4;

import java.util.Locale;
import java.util.Scanner;

public class Sentinela {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int medicao;
        double soma = 0.0;
        int cont = 0;

        System.out.print("Digite as medições: (-1 para sair)");
        medicao = sc.nextInt();

        while (medicao != -1) {
            soma += medicao;
            cont++;
            System.out.print("Digite outra medida: ");
            medicao = sc.nextInt();
        }

        if (cont > 0) {
            double media = soma / cont;
            System.out.println("Soma = " + soma);
            System.out.println("Media = " + media);
        } else {
            System.out.println("Nenhuma medição válida foi informada.");
        }
        sc.close();
    }
}
