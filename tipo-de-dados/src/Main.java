import calculadora.Calculadora;

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
        System.out.println(operador + " : " + soma);

        boolean ehIgual = num1 < num2;
        System.out.println(!ehIgual);

        Calculadora calculadora = new Calculadora(1.5, 3.5);
        Calculadora calculadora1 = new Calculadora(1.5, 3.5);
        Calculadora calculadora2 = new Calculadora(2.0, 4.0);

        System.out.println(calculadora.somaTest());
        System.out.println(calculadora1.somaTest());
        System.out.println(calculadora2.somaTest());
        System.out.println(calculadora1 == calculadora2);
        System.out.println(calculadora.numero1.equals(calculadora1.numero1));


    }

}