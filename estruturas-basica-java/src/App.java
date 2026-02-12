public class App {


        static void test() {
        String saudacao = "Compila com static, com o mesmo nome de variavel pq tem scopos diferentes.";
        System.out.println(saudacao);
        }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 
        /*        
         * <tipo> indentificador = valor;
         * <tipo> indentificador;
         * 
         * Variaves tem scopos: bloco de comando no qual a variavel foi declarada
         * 
        */
        String saudacao = "Ola Guilherme";
        test();
        System.out.println(saudacao);

        
    }
}
