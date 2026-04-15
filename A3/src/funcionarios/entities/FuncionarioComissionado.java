package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioComissionado extends FolhaDePagamento {

    private Long id;
    private String nome;
    private String matricula;
    private Integer valorDaComissao;
    private Integer percentualDeComissao;

    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(Long id, String nome, String matricula, Integer valorDaComissao, Integer percentualDeComissao) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.valorDaComissao = valorDaComissao;
        this.percentualDeComissao = percentualDeComissao;
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
