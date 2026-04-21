package funcionarios.validador;

public class Validador {

    public String validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (nome.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Nome não pode conter números.");
        }
        return nome.trim();
    }

    public int validarPositivo(int valor, String campo) {
        if (valor <= 0) {
            throw new IllegalArgumentException(campo + " deve ser positivo.");
        }
        return valor;
    }

    public double validarPositivo(double valor, String campo) {
        if (valor <= 0) {
            throw new IllegalArgumentException(campo + " deve ser positivo.");
        }
        return valor;
    }
}