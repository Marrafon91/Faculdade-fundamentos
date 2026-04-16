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

        FuncionarioPadrao fp = new FuncionarioPadrao();
        FuncionarioComissionado fc = new FuncionarioComissionado();
        FuncionarioProducao fp1 = new FuncionarioProducao();

        System.out.println("Digite o nome do funcionario: ");

        fp.setNome("Fulano");
        fp.setMatricula("123");
        fp.calcularSalarioFinal();
        System.out.println(fp);
        System.out.println();

        fc.setNome("Pedro");
        fc.setMatricula("456");
        fc.setValorDaComissao(1000);
        fc.setPercentualDeComissao(5);
        fc.calcularSalarioFinal();
        System.out.println("########################");
        System.out.println("Funcionario Comissionado");
        System.out.println(fc);


        fp1.setNome("Cristiano");
        fp1.setMatricula("789");
        fp1.setValorDaPeca(5.0);
        fp1.setQuantidadeDePecas(100);
        fp1.calcularSalarioFinal();
        System.out.println(fp1);
        System.out.println();

        folha.add(fp);
        folha.add(fc);
        folha.add(fp1);

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
