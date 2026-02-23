package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhada = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhada * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
