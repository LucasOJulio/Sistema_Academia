package modelo;

import java.util.*;

public class Modalidade {
    private String nome;
    private List<Aluno> alunos;

    public Modalidade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Aluno> getAlunos() { return alunos; }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}