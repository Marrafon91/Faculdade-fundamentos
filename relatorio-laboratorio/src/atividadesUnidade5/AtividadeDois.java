package atividadesUnidade5;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pulsacao;

        System.out.print("Digite a pulsação: ");
        pulsacao = sc.nextInt();

        if (pulsacao < 60) {
            System.out.print("Bradicardia");
        } else if (pulsacao <= 100) {
            System.out.print("Normal");
        } else {
            System.out.print("Taquicardia");
        }
        sc.close();
    }
}
