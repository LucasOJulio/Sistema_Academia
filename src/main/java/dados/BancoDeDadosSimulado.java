package dados;

import modelo.*;
import java.util.*;

public class BancoDeDadosSimulado {
    private List<Aluno> alunos = new ArrayList<>();
    private List<Modalidade> modalidades = new ArrayList<>();

    public BancoDeDadosSimulado() {
        Modalidade yoga = new Modalidade("Yoga");
        Modalidade musculacao = new Modalidade("Musculação");

        Aluno a1 = new Aluno("Carlos");
        a1.adicionarAtividadeExtra("Pilates");
        a1.adicionarAvaliacao(new Avaliacao("Prof. Ana", 7.5));
        yoga.adicionarAluno(a1);

        Aluno a2 = new Aluno("Lucia");
        a2.adicionarAtividadeExtra("Zumba");
        a2.adicionarAvaliacao(new Avaliacao("Prof. Ana", 8.2));
        musculacao.adicionarAluno(a2);

        Aluno a3 = new Aluno("João");
        a3.adicionarAvaliacao(new Avaliacao("Prof. Bruno", 9.1));
        yoga.adicionarAluno(a3);

        alunos.addAll(Arrays.asList(a1, a2, a3));
        modalidades.addAll(Arrays.asList(yoga, musculacao));
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }
}