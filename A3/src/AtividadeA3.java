import funcionarios.entities.FuncionarioComissionado;
import funcionarios.entities.FuncionarioPadrao;
import funcionarios.entities.FuncionarioProducao;
import funcionarios.pagamento.FolhaDePagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AtividadeA3 {
    public static void main(String[] args) {

        List<FolhaDePagamento> folha = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha o tipo de funcionario: \n");
            System.out.println("1 - Funcionario Padrão");
            System.out.println("2 - Funcionario Comissionado");
            System.out.println("3 - Funcionario de Produção");
            System.out.println("4 - Folha De Pagamento");
            System.out.println("0 - Sair\n");
            System.out.println("Digite uma das opçpões acima: ");
            System.out.println("Selecione um numero entre 0 a 4!!!");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do funcionario: ");
                    String nomePadrao = sc.nextLine();

                    System.out.println("Digite a Matricula do funcionario: ");
                    String matriculaPadrao = sc.nextLine();

                    FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao(nomePadrao, matriculaPadrao);
                    folha.add(funcionarioPadrao);

                    System.out.println("Funcionario Padrão cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do funcionario: ");
                    String nomeComissionado = sc.nextLine();

                    System.out.println("Digite a Matricula do funcionario: ");
                    String matriculaComissionado = sc.nextLine();

                    System.out.println("Digite o valor da comissão: ");
                    double valorComissao = sc.nextDouble();

                    System.out.println("Digite o percentual de comissão: ");
                    double percentualComissao = sc.nextDouble();
                    sc.nextLine();

                    FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado(nomeComissionado, matriculaComissionado, valorComissao, percentualComissao);
                    folha.add(funcionarioComissionado);

                    System.out.println("Funcionario Comissionado cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o nome do funcionario: ");
                    String nomeProducao = sc.nextLine();

                    System.out.println("Digite a Matricula do funcionario: ");
                    String matriculaProducao = sc.nextLine();

                    System.out.println("Digite a quantidade de peças: ");
                    int quantidadePecas = sc.nextInt();

                    System.out.println("Digite o valor da peça: ");
                    double valorPeca = sc.nextDouble();
                    sc.nextLine();

                    FuncionarioProducao funcionarioProducao = new FuncionarioProducao(nomeProducao, matriculaProducao, quantidadePecas, valorPeca);
                    folha.add(funcionarioProducao);

                    System.out.println("Funcionario de Produção cadastrado com sucesso!");
                    break;
                case 4:
                    System.out.println("Folha de Pagamento:");
                    System.out.println("Quantidade de Funcionario: " + folha.size());
                    for (FolhaDePagamento f : folha) {
                        System.out.println(f.toString());
                        System.out.println("----------------------");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println("Digite uma opção válida!!!");
                    System.out.println("----------------------");
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}
