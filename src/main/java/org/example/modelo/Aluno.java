package org.example.modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int idade;
    private List<String> atividadesExtras = new ArrayList<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private int totalAulas;
    private int presencas;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void adicionarAtividadeExtra(String atividade) {
        atividadesExtras.add(atividade);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void registrarFrequencia(int totalAulas, int presencas) {
        this.totalAulas = totalAulas;
        this.presencas = presencas;
    }

    public double getFrequenciaMensal() {
        if (totalAulas == 0) return 0;
        return (double) presencas / totalAulas * 100;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
}