import io.github.marrafon91.relogio.despertador.Despertador;

public class App {

    static void test() {
        String saudacao = "Compila com static, com o mesmo nome de variavel pq tem scopos diferentes.";
        System.out.println(saudacao);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        String saudacao = "Ola Guilherme";
        test();
        System.out.println(saudacao);

        Despertador despertador = new Despertador(12, 30, 5);
        System.out.println(despertador.agendarAlarme());
        despertador.ativarSoneca();
    }
}
