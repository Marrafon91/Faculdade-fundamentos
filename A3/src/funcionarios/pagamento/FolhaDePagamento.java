package funcionarios.pagamento;

public abstract class FolhaDePagamento {

    private static long contador = 1;
    private long id;
    private String nome;
    private String matricula;
    private double salarioFixo;

    public FolhaDePagamento() {
        this.id = contador++;
    }

    public FolhaDePagamento(long id, String nome, String matricula, double salarioFixo) {
        this.id = contador++;
        this.nome = nome;
        this.matricula = matricula;
        this.salarioFixo = salarioFixo;
    }

    public long getId() {
        return id;
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
        return "ID: " + id +
                "\nNome: " + nome +
                "\nMatricula: " + matricula +
                "\nSalario Fixo: " + salarioFixo +
                "\nSalario Final: " + calcularSalarioFinal();
    }
}
