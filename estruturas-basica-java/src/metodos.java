public class metodos {

    public static void main(String[] args) {
        // String mensagemDoAlarme = agendarAlarme(12, 30);
        // System.out.println(mensagemDoAlarme);
        // ativarSoneca();

        Despertador despertador = new Despertador(12, 30, 5);
        System.out.println(despertador.agendarAlarme());
        despertador.ativarSoneca();
    }

    // static void ativarSoneca() {
    //    System.out.println("Mais 5 minutos");
    // }
    

    // static String agendarAlarme(int hora, int minutos) {
    //     return "\nSeu alarme foi configurado as " + hora + ":" + minutos + "h";
    // }
}
