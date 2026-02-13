package conta;

public class Conta {

    static double saldoContaConjunta;
    double saldo;
    final static  double TAXA_SERVICOS = 10.5;

    public Conta() {
    }

    public void depositarContaConjunta(double valor) {
        saldoContaConjunta += valor;
    }

    public void depositarConta(double valor) {
        saldo += valor;
    }

}
