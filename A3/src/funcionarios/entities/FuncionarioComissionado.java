package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioComissionado extends FolhaDePagamento {

    private double valorDaComissao;
    private double percentualDeComissao;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(String nome, String matricula, double valorDaComissao, double percentualDeComissao) {
        super(nome, matricula);
        this.valorDaComissao = valorDaComissao;
        this.percentualDeComissao = percentualDeComissao;
    }

    public double getValorDaComissao() {
        return valorDaComissao;
    }

    public void setValorDaComissao(double valorDaComissao) {
        this.valorDaComissao = valorDaComissao;
    }

    public double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (valorDaComissao * percentualDeComissao / 100.0);
    }

    @Override
    public String toString() {
        return "FuncionarioComissionado{" +
                " valorDaComissao=" + valorDaComissao +
                ", percentualDeComissao=" + percentualDeComissao +
                ", Salario Final=" + calcularSalarioFinal() +
                '}';
    }
}
