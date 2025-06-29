package modelo;

import java.util.*;

public class Aluno {
    private String nome;
    private int frequenciaMensal;
    private List<String> atividadesExtras;
    private List<Avaliacao> avaliacoes;

    public Aluno(String nome) {
        this.nome = nome;
        this.frequenciaMensal = new Random().nextInt(30);
        this.atividadesExtras = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public int getFrequenciaMensal() { return frequenciaMensal; }
    public List<String> getAtividadesExtras() { return atividadesExtras; }
    public List<Avaliacao> getAvaliacoes() { return avaliacoes; }

    public void adicionarAtividadeExtra(String atividade) {
        atividadesExtras.add(atividade);
    }

    public void adicionarAvaliacao(Avaliacao a) {
        avaliacoes.add(a);
    }
}