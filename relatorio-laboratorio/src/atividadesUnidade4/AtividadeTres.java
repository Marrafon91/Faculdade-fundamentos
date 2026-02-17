package atividadesUnidade4;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeTres {

//    Reativação curta
//    Problema-núcleo: entrada → processamento → saída, com evidência.
//    Critério: tipos adequados e saída conferível.
//    Evidência: dois testes com resultado esperado.

//    Enunciado
//    Crie um programa Java que leia uma temperatura em Celsius e mostre a temperatura em Fahrenheit.
//    Fórmula: F = C * 9/5 + 32.
//
//   Passos obrigatórios (para reduzir carga cognitiva)
//1. Imprima um título.

//2. Leia um double do usuário (Celsius).
//   3. Calcule Fahrenheit em uma variável double.
//   4. Imprima o resultado com duas casas decimais.
//   5. Rode dois testes e compare com o esperado.
//
//    Casos de teste sugeridos
//    Teste 1: C = 0 → F esperado = 32.00
//    Teste 2: C = 25 → F esperado = 77.00
//    Código base (você completa as partes marcadas)

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor Celsius Para Fahrenheit ===");
        System.out.print("Informe A Temperatura Em Celsius: ");
        double celsius = sc.nextDouble();

        // Complete o processamento:
        double fahrenheit = (celsius *  9.0/5.0) + 32;

        System.out.printf("Temperatura Em Fahrenheit: %.2f °F%n", fahrenheit);

        sc.close();
    }
}
