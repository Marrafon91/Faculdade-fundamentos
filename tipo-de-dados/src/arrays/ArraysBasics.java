package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBasics {

    public static void main(String[] args) {

        String [] tarefas = new String[4]; // {"Estudar", "Faculdade", "Programar", "Melhorar"};
//
//        System.out.println(tarefas[0].equals("Estudar"));
//        System.out.println(tarefas.length);
//        System.out.println(Arrays.toString(tarefas));

        ArrayList<String> tarefas1 = new ArrayList<>();
        tarefas1.add("Estudar");
        tarefas1.add("Faculdade");
        tarefas1.add("Programar");
        tarefas1.add("Melhorar");

        System.out.println(tarefas1.get(0));
        System.out.println(tarefas1.get(1));
        System.out.println(tarefas1.get(2));
        System.out.println(tarefas1.get(3));
        System.out.println(tarefas1.size());
    }
}
