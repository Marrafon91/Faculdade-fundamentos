package conta;

public class ModificadorStatic {

    public static void main(String[] args) {

        Conta contaJoao = new Conta();
        Conta contaMaria = new Conta();

        contaJoao.depositarContaConjunta(100.00);
        contaMaria.depositarConta(400.00);

        System.out.println(Conta.saldoContaConjunta);
        System.out.println(contaJoao.saldo);
        System.out.println(contaMaria.saldo);
        System.out.println(Conta.TAXA_SERVICOS);
    }
}
