package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioProducao extends FolhaDePagamento {

    private Integer quantidadeDePecas;
    private Double valorDaPeca;

    public FuncionarioProducao() {
    }

    public FuncionarioProducao(long id, String nome, String matricula, double salarioFixo, Integer quantidadeDePecas, Double valorDaPeca) {
        super(id, nome, matricula, salarioFixo);
        this.quantidadeDePecas = quantidadeDePecas;
        this.valorDaPeca = valorDaPeca;
    }

    public Integer getQuantidadeDePecas() {
        return quantidadeDePecas;
    }

    public void setQuantidadeDePecas(Integer quantidadeDePecas) {
        this.quantidadeDePecas = quantidadeDePecas;
    }

    public Double getValorDaPeca() {
        return valorDaPeca;
    }

    public void setValorDaPeca(Double valorDaPeca) {
        this.valorDaPeca = valorDaPeca;
    }

    @Override
    public double calcularSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "FuncionarioProducao{" +
                "quantidadeDePecas=" + quantidadeDePecas +
                ", valorDaPeca=" + valorDaPeca +
                '}';
    }
}
