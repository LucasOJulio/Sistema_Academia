package org.example.testes;

import org.example.modelo.Avaliacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AvaliacaoTest {

    @Test
    public void testIndiceEvolucao() {
        Avaliacao avaliacao = new Avaliacao(80.0, 75.0);
        assertEquals(8, avaliacao.getIndiceEvolucao(), 0.01);
    }
}