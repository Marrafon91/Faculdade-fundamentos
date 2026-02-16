package strings;

public class StringBasics {

    public static void main(String[] args) {

        String str1 = new String("Java s2");
        String str2 = new String("Java s2");
        String str3 = "Java s2";
        String str4 = "Java s2";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println("\nJava\t s2");

        String nome = "Guilherme Marrafon";
        System.out.println("Primeira Letra do nome: " + nome.charAt(0));

        System.out.println("Posição da letra G no nome: " + nome.indexOf("n"));

        int posicaoSobrenome = nome.indexOf(" ") + 1;
        System.out.println("Posição do sobrenome: " + nome.substring(posicaoSobrenome));

        System.out.println("Numero de caracteres no nome: " + (nome.length() - 1));

        System.out.println(nome.replaceAll("e", "1"));
        System.out.println(nome);

    }
}
