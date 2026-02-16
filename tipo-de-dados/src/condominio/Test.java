package condominio;

public class Test {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Piscina piscina = new Piscina();
        System.out.println(biblioteca.banheiro);
        System.out.println(piscina.getBoia());
        piscina.setBoia("Nova boia");
    }
}
