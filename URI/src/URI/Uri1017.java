package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int consumoPorLitro = 12;
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        double distancia = (double) (tempo * velocidade) / consumoPorLitro;

        System.out.printf("%.3f%n", distancia);
        sc.close();
    }
}
