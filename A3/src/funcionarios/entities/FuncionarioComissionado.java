package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioComissionado extends FolhaDePagamento {

    private Integer valorDaComissao;
    private Integer percentualDeComissao;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(long id, String nome, String matricula, double salarioFixo, Integer valorDaComissao, Integer percentualDeComissao) {
        super(id, nome, matricula, salarioFixo);
        this.valorDaComissao = valorDaComissao;
        this.percentualDeComissao = percentualDeComissao;
    }

    public Integer getValorDaComissao() {
        return valorDaComissao;
    }

    public void setValorDaComissao(Integer valorDaComissao) {
        this.valorDaComissao = valorDaComissao;
    }

    public Integer getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(Integer percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    @Override
    public double calcularSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "FuncionarioComissionado{" +
                "valorDaComissao=" + valorDaComissao +
                ", percentualDeComissao=" + percentualDeComissao +
                '}';
    }
}
