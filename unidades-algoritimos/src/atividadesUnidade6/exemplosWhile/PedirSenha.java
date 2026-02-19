package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class PedirSenha {

//    Pedir uma senha e repetir até estar correta (sem saber quantas tentativas).

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final String senha = "Java123";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextLine().trim();

            if (!senhaDigitada.equals(senha)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }

        } while (!senhaDigitada.equals(senha));

        System.out.println("Senha correta!");
        sc.close();
    }
}
