package funcionarios.pagamento;

public abstract class FolhaDePagamento {

    private String nome;
    private String matricula;
    private double salarioFixo = 2000.0;

    public FolhaDePagamento() {
    }

    public FolhaDePagamento(String nome, String matricula, double salarioFixo) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioFixo = salarioFixo;
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

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public abstract double calcularSalarioFinal();

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nMatricula: " + matricula +
                "\nSalario Fixo: " + salarioFixo +
                "\nSalario Final: " + calcularSalarioFinal();
    }
}
