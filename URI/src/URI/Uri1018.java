package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1018 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        System.out.println(valor);

        int[] notas = {100,50,20,10,5,2,1};

        for (int i = 0; i < notas.length; i++) {
            int quantidade = valor / notas[i];
            System.out.println(quantidade + " nota(s) de R$ " + notas[i] + ",00");
            valor %= notas[i];
        }
        sc.close();
    }
}
