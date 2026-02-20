package atividadeUnidade7;

import atividadeUnidade7.calculoIMC.CalculoDoIMC;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaIMC {

    private static final double IMC_NORMAL_MIN = 18.5;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pesoPaciente;
        double alturaPaciente;

        while (true) {
            System.out.print("Digite seu peso: ");
            if (sc.hasNextDouble()) {
                pesoPaciente = sc.nextDouble();
                if (pesoPaciente > 0) {
                    break;
                } else {
                    System.out.println("Peso deve ser positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.next();
            }
        }

        while (true) {
            System.out.print("Digite sua altura: ");
            if (sc.hasNextDouble()) {
                alturaPaciente = sc.nextDouble();
                if (alturaPaciente > 0) {
                    break;
                } else {
                    System.out.println("Altura deve ser positiva.");
                }
            } else {
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.next();
            }
        }

        CalculoDoIMC calculoDoIMC = new CalculoDoIMC();

        try {
            double imc = calculoDoIMC.calcularIMC(pesoPaciente, alturaPaciente);

            System.out.printf("Seu IMC é %.2f%n", imc);
            System.out.printf("O IMC normal mínimo é %.2f%n", IMC_NORMAL_MIN);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}