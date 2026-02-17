package atividadesUnidade4;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeQuatro {

//    Reativação curta
//    Problema-núcleo: médias e percentuais são armadilhas comuns.
//    Critério: evitar divisão inteira e provar com testes.
//    Evidência: conferir manualmente com casos simples.

//    Enunciado
//    Crie um programa Java que leia três notas (double) e calcule a média simples.
//    Depois imprima “media final” com duas casas decimais.
//
//    Casos de teste sugeridos
//    Teste 1: 10, 10, 10 → média = 10.00
//    Teste 2: 7, 8.5, 6 → média = 7.17 (aproximado)
//
//    Checklist de qualidade (marque mentalmente)
//    Você usou double para as notas.
//    Você guardou a soma em uma variável antes de dividir (verificável).
//    Você imprimiu com duas casas decimais.
//    Você testou com pelo menos dois casos.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaUm, notaDois, notaTres, media, mediaFinal;

        System.out.println("Suas notas são: ");
        System.out.print("Nota 1: ");
        notaUm = sc.nextDouble();

        System.out.print("Nota 2: ");
        notaDois = sc.nextDouble();

        System.out.print("Nota 3: ");
        notaTres = sc.nextDouble();

        media = notaUm + notaDois + notaTres;
        mediaFinal = media / 3;

        System.out.printf("Sua media final foi: %.2f", mediaFinal);

        sc.close();
    }
}
