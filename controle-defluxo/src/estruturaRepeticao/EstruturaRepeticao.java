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

        String adicionarNovaTarefa = "s";

        while (adicionarNovaTarefa.equalsIgnoreCase("s")) {
            System.out.println("Informe a tarefa: ");
            String tarefa = sc.nextLine().trim();
            tarefas.add(tarefa);

            System.out.println("Adicionar nova tarefa (s/n)? ");
            adicionarNovaTarefa = sc.nextLine().trim();
        }

        System.out.println("\nSuas tarefas: ");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("[ ] " + tarefas.get(i));
        }
       sc.close();
    }
}
