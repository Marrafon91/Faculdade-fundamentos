package io.github.marrafon91.relogio.despertador;

public class Despertador {

    private int horas;
    private int minutos;
    private int soneca;


    public Despertador() {
    }

    public Despertador(int horas, int minutos, int soneca) {
        this.horas = horas;
        this.minutos = minutos;
        this.soneca = soneca;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSoneca() {
        return soneca;
    }

    public void setSoneca(int soneca) {
        this.soneca = soneca;
    }

    public void ativarSoneca() {
        System.out.println("Mais " + soneca + " minutos");
    }

    public String agendarAlarme() {
        return "\nSeu alarme foi configurado as " + horas + ":" + minutos + "h";
    }

    @Override
    public String toString() {
        return "Despertador [horas=" + horas + ", minutos=" + minutos + ", soneca=" + soneca + "]";
    }
}
