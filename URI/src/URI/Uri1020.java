package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1020 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int resto, ano, mes, dia;
        int n = sc.nextInt();

        ano = n / 365;
        resto = n % 365;
        mes = resto / 30;
        resto %= 30;
        dia = resto;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        sc.close();
    }
}
