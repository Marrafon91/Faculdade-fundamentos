package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1  = sc.nextDouble();
        double n2  = sc.nextDouble();
        double n3  = sc.nextDouble();
        double n4  = sc.nextDouble();

        double media = Math.floor((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1)) / 10;

        if (media >= 7.0) {
        System.out.printf("Media: %.1f%n", media);
        System.out.println("Aluno aprovado.");

        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");

        } else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");

            double notaDoExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaDoExame);
            double mediaFinal = (media + notaDoExame) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
            }
        }
        sc.close();
    }
}