package estoque;

public class Loja {

    private boolean clientePremiun;
    private double compra;
    private double desconto;

    public Loja() {
    }

    public Loja(boolean clientePremiun, double compra, double desconto) {
        this.clientePremiun = clientePremiun;
        this.compra = compra;
        this.desconto = desconto;
    }

    public boolean isClientePremiun() {
        return clientePremiun;
    }

    public void setClientePremiun(boolean clientePremiun) {
        this.clientePremiun = clientePremiun;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void compraDesconto() {
        if (clientePremiun && compra >= 200) {
            desconto = 0.15;

        } else if (compra >= 200) {
            desconto = 0.05;

        } else {
            desconto = 0.0;
        }
    }

    public double valorTotal() {
        return compra - (compra * desconto);
    }
}
