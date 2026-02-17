package estruturaRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> tarefas = new ArrayList<>();

        System.out.println("Vamos fazer algumas tarefas (s/n)? ");
        String adicionarNovaTarefa = sc.nextLine().trim();

        while (!adicionarNovaTarefa.equalsIgnoreCase("s") &&
                !adicionarNovaTarefa.equalsIgnoreCase("n")) {

            System.out.println("Resposta inválida. Digite apenas (s/n): ");
            adicionarNovaTarefa = sc.nextLine().trim();
        }

        while (adicionarNovaTarefa.equalsIgnoreCase("s")) {

            System.out.println("Informe a tarefa: ");
            String tarefa = sc.nextLine().trim();

            tarefas.add(tarefa);

            System.out.println("Adicionar nova tarefa (s/n)? ");
            adicionarNovaTarefa = sc.nextLine().trim();
        }

        if (tarefas.isEmpty()) {
            System.out.println("Você não tem nenhuma tarefa.");
        } else {
            System.out.println("\nSuas tarefas:");
            int contador = 1;
            for (String t : tarefas) {
                System.out.println("[" + contador + "] " + t);
                contador++;
            }
        }
        sc.close();
    }
}

