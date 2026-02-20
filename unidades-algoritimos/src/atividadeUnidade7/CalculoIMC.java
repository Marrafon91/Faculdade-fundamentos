package atividadeUnidade7;

import atividadeUnidade7.calculoIMC.CalculoDoIMC;

import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double pesoPaciente = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double alturaPaciente = sc.nextDouble();

        CalculoDoIMC calculoDoIMC = new CalculoDoIMC();
        double imc = calculoDoIMC.calcularIMC(pesoPaciente,alturaPaciente);

        if (!Double.isNaN(imc)) {
        System.out.printf("Seu IMC é %.2f%n", imc);
        }

        sc.close();
    }
}
