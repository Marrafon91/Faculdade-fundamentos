package atividadeUnidade7.calculoIMC;

public class CalculoDoIMC {

    private Double peso;
    private Double altura;

    public CalculoDoIMC() {
    }

    public CalculoDoIMC(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Dados inválidos");
        }
        return peso / (altura * altura);
    }
}
