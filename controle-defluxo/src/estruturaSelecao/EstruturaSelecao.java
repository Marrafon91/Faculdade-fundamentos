package estruturaSelecao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("Bem vindo aos meus estudos! Temos as seguintes opções: ");
        System.out.println("1. Vamos aprender Estruturas em Java");
        System.out.println("2. Vamos aprender Operadores em Java");
        System.out.println("3. Vamos aprender Tipos em Java");
        System.out.println("4. Vamos aprender Variaves em Java");
        System.out.print("Digite a opção desejada ");

        int opcao = sc.nextInt();

//        if (opcao == 1) {
//            System.out.println("Bora aprender estruturas em Java.");
//        } else if (opcao == 2) {
//            System.out.println("Bora aprender operadores em Java.");
//        } else if (opcao == 3) {
//            System.out.println("Bora aprender tipos em Java.");
//        } else if (opcao == 4) {
//            System.out.println("Bora aprender variaves em Java.");
//        } else {
//            System.out.println("Tudo bem, volte quando quiser Estudar Java.");
//        }

        String mensagem = switch (opcao) {
            case 1 ->  "Bora aprender estruturas em Java.";
            case 2 ->  "Bora aprender operadores em Java.";
            case 3 ->  "Bora aprender tipos em Java.";
            case 4 ->  "Bora aprender variaves em Java.";
            default -> "Tudo bem, volte quando quiser Estudar Java.";
        };
        System.out.println(mensagem);
        sc.close();
    }
}
