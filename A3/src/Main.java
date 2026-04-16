import funcionarios.entities.FuncionarioComissionado;
import funcionarios.entities.FuncionarioPadrao;
import funcionarios.entities.FuncionarioProducao;
import funcionarios.pagamento.FolhaDePagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<FolhaDePagamento> folha = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao();

        System.out.println("Digite o nome do funcionario: ");
        funcionarioPadrao.setNome("Fulano");
        funcionarioPadrao.setMatricula("123");
        funcionarioPadrao.calcularSalarioFinal();

        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado();

        funcionarioComissionado.setNome("Pedro");
        funcionarioComissionado.setMatricula("456");
        funcionarioComissionado.setValorDaComissao(2000);
        funcionarioComissionado.setPercentualDeComissao(5);
        funcionarioComissionado.calcularSalarioFinal();

        FuncionarioProducao funcionarioProducao = new FuncionarioProducao();

        funcionarioProducao.setNome("Cristiano");
        funcionarioProducao.setMatricula("789");
        funcionarioProducao.setValorDaPeca(5.0);
        funcionarioProducao.setQuantidadeDePecas(100);
        funcionarioProducao.calcularSalarioFinal();

        folha.add(funcionarioPadrao);
        folha.add(funcionarioComissionado);
        folha.add(funcionarioProducao);

        System.out.println("Total de pessoas cadastradas: " + folha.size());

        for (FolhaDePagamento f : folha) {
            System.out.println("ID: " + f.getId());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Matrícula: " + f.getMatricula());
            System.out.println("Salario Fixo: " + f.getSalarioBase());
            System.out.println("Salário final: " + String.format("%.2f", f.calcularSalarioFinal()));
            System.out.println("----------------------");
        }
        sc.close();
    }
}
