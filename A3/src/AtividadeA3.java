import funcionarios.entities.FuncionarioComissionado;
import funcionarios.entities.FuncionarioPadrao;
import funcionarios.entities.FuncionarioProducao;
import funcionarios.pagamento.FolhaDePagamento;
import funcionarios.validador.Validador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AtividadeA3 {

    public static String lerNomeValido(Scanner sc, Validador validador) {
        while (true) {
            System.out.println("Digite o nome do funcionario: ");
            String nome = sc.nextLine();

            try {
                return validador.validarNome(nome);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int lerIntPositivo(Scanner sc, Validador validador, String campo) {
        while (true) {
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return validador.validarIntPositivo(valor, campo);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double lerDoublePositivo(Scanner sc, Validador validador, String campo) {
        while (true) {
            try {
                double valor = sc.nextDouble();
                sc.nextLine();
                return validador.validarDoublePositivo(valor, campo);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        List<FolhaDePagamento> folha = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Validador validador = new Validador();

        int opcao;

        do {
            System.out.println("\nEscolha o tipo de funcionario:");
            System.out.println("1 - Funcionario Padrão");
            System.out.println("2 - Funcionario Comissionado");
            System.out.println("3 - Funcionario de Produção");
            System.out.println("4 - Folha De Pagamento");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    String nomePadrao = lerNomeValido(sc, validador);

                    System.out.println("Digite a Matricula do funcionario: ");
                    String matriculaPadrao = sc.nextLine();

                    FuncionarioPadrao fp = new FuncionarioPadrao(nomePadrao, matriculaPadrao);
                    folha.add(fp);

                    System.out.println("Funcionario Padrão cadastrado com sucesso!");
                    break;

                case 2:
                    String nomeComissionado = lerNomeValido(sc, validador);

                    System.out.println("Digite a Matricula do funcionario: ");
                    String matriculaComissionado = sc.nextLine();

                    System.out.println("Digite o valor da comissão: ");
                    double valorComissao = lerDoublePositivo(sc, validador, "Valor da comissão");

                    System.out.println("Digite o percentual de comissão: ");
                    double percentual = lerDoublePositivo(sc, validador, "Percentual de comissão");

                    FuncionarioComissionado fc = new FuncionarioComissionado(nomeComissionado,matriculaComissionado,valorComissao,percentual);
                    folha.add(fc);

                    System.out.println("Funcionario Comissionado cadastrado com sucesso!");
                    break;

                case 3:
                    String nomeProducao = lerNomeValido(sc, validador);

                    System.out.println("Digite a Matricula do funcionario: ");
                    String matriculaProducao = sc.nextLine();

                    System.out.println("Digite a quantidade de peças: ");
                    int quantidade = lerIntPositivo(sc, validador, "Quantidade de peças");

                    System.out.println("Digite o valor da peça: ");
                    double valorPeca = lerDoublePositivo(sc, validador, "Valor da peça");

                    FuncionarioProducao fprod = new FuncionarioProducao(nomeProducao,matriculaProducao,quantidade,valorPeca);
                    folha.add(fprod);

                    System.out.println("Funcionario de Produção cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\nFolha de Pagamento:");
                    System.out.println("Quantidade de Funcionarios: " + folha.size());
                    System.out.println("----------------------");

                    for (FolhaDePagamento f : folha) {
                        System.out.println(f.toString());
                        System.out.println("----------------------");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}