package funcionarios.entities;

import funcionarios.pagamento.FolhaDePagamento;

public class FuncionarioPadrao extends FolhaDePagamento {

    public FuncionarioPadrao() {
    }

    public FuncionarioPadrao(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return "Funcionario Padrão: " +
                "\nID: " + getId() +
                "\nNome: " + getNome() +
                "\nMatricula: " + getMatricula() +
                "\nSalario Base: " + getSalarioBase() +
                "\nSalario Final: " + calcularSalarioFinal();
    }
}

