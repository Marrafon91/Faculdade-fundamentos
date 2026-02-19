package atividadesUnidade6.exemplosWhile;

import java.util.Locale;
import java.util.Scanner;

public class SenhaAuthenticada {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int maxTentativas = 3;
        int tentativas = 0;
        boolean autenticado = false;

        while (tentativas < maxTentativas && !autenticado) {
            System.out.print("Digite A Senha: ");
            String senha = sc.next();

            if (senha.equals("java123")) {
                autenticado = true;
            } else {
                System.out.println("Senha Incorreta.");
            }

            tentativas++;
        }

        if (autenticado) {
            System.out.println("Acesso Liberado.");
        } else {
            System.out.println("Acesso Bloqueado Por Excesso De Tentativas.");
        }
        sc.close();
    }
}
