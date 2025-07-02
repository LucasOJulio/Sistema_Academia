package org.example.testes;

import org.example.modelo.Modalidade;
import org.example.modelo.Aluno;
import org.junit.jupiter.api.Test;

public class ModalidadeTest {

    @Test
    public void testAdicionarAluno() {
        Modalidade modalidade = new Modalidade("Musculação");
        Aluno aluno = new Aluno("Lucas", 25);
        modalidade.adicionarAluno(aluno);
    }
}