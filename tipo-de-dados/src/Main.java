import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        byte numero = 100;
        short numero1 = 10000;
        int numero2 = 1000000000;
        long numero3 = 100_000_000_000_000_000_0L;

        int numero4 = numero + numero1;

        long numero5 = numero3 / numero2 / numero1 / numero;

        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println("########################");

        float n1 = 1.5f;
        float n2 = 1.5f;
        float soma = n1 + n2;

        char operador = '+';

        double num1 = 2.5;
        double num2 = 7.5;

        System.out.println(soma);
        double resultado = soma(5, 5);
        System.out.println(operador + " : " + resultado);

        boolean ehIgual = num1 < num2;
        System.out.println(!ehIgual);


    }

    static double soma(double numero1, double numero2) {
        return  numero1 + numero2;
    }
}