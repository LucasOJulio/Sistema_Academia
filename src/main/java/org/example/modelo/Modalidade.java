package org.example.modelo;

import java.util.ArrayList;
import java.util.List;

public class Modalidade {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Modalidade(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }
}