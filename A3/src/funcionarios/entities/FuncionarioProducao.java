package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioProducao extends FolhaDePagamento {

    private int quantidadeDePecas;
    private double valorDaPeca;

    public FuncionarioProducao() {
    }

    public FuncionarioProducao(String nome, String matricula, int quantidadeDePecas, double valorDaPeca) {
        super(nome, matricula);
        this.quantidadeDePecas = quantidadeDePecas;
        this.valorDaPeca = valorDaPeca;
    }

    public int getQuantidadeDePecas() {
        return quantidadeDePecas;
    }

    public void setQuantidadeDePecas(int quantidadeDePecas) {
        this.quantidadeDePecas = quantidadeDePecas;
    }

    public double getValorDaPeca() {
        return valorDaPeca;
    }

    public void setValorDaPeca(double valorDaPeca) {
        this.valorDaPeca = valorDaPeca;
    }

    @Override
    public double calcularSalarioFinal() {
        double valorDaComissao = valorDaPeca * quantidadeDePecas;
        return getSalarioBase() + valorDaComissao;
    }

    @Override
    public String toString() {
        return  "Funcionario Produção: " +
                "\nID: " + getId() +
                "\nNome: " + getNome() +
                "\nMatricula: " + getMatricula() +
                "\nSalario Base: " + getSalarioBase() +
                "\nQuantidade de Peças: " + quantidadeDePecas +
                "\nValor da Peça: " + valorDaPeca +
                "\nSalario Final: " + calcularSalarioFinal();
    }
}
