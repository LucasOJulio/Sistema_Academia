package org.example.testes;

import org.example.modelo.Aluno;
import org.example.modelo.Avaliacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
//Testa aluno
    @Test
    public void testAdicionarAtividadeExtra() {
        Aluno aluno = new Aluno("Lucas Julio", 25);
        aluno.adicionarAtividadeExtra("Pilates");
    }

    @Test
    public void testAdicionarAvaliacao() {
        Aluno aluno = new Aluno("Lucas", 25);
        Avaliacao avaliacao = new Avaliacao(80, 75);
        aluno.adicionarAvaliacao(avaliacao);
    }

    @Test
    public void testFrequenciaMensal() {
        Aluno aluno = new Aluno("Lucas", 25);
        aluno.registrarFrequencia(20, 18);
        assertEquals(90.0, aluno.getFrequenciaMensal(), 0.01);
    }
}