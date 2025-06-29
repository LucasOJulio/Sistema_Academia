package org.example.modelo;

public class Avaliacao {
    private double pesoInicial;
    private double pesoAtual;

    public Avaliacao(double pesoInicial, double pesoAtual) {
        this.pesoInicial = pesoInicial;
        this.pesoAtual = pesoAtual;
    }

    public double getIndiceEvolucao() {
        if (pesoInicial == 0) return 0;
        return ((pesoInicial - pesoAtual) / pesoInicial) * 100;
    }
}