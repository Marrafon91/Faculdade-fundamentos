package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioProducao extends FolhaDePagamento {

    private Long id;
    private String nome;
    private String matricula;
    private Integer quantidadeDePecas;
    private Double valorDaPeca;

    public FuncionarioProducao() {
    }

    public FuncionarioProducao(Long id, String nome, String matricula, Integer quantidadeDePecas, Double valorDaPeca) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.quantidadeDePecas = quantidadeDePecas;
        this.valorDaPeca = valorDaPeca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", quantidadeDePecas=" + quantidadeDePecas +
                ", valorDaPeca=" + valorDaPeca +
                '}';
    }
}
