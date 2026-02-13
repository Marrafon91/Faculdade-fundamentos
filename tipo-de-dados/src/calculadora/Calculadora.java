package calculadora;

public class Calculadora {
    public Double numero1;
    Double numero2;

    public Calculadora(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double somaTest() {
        return  numero1 + numero2;
    }
}
