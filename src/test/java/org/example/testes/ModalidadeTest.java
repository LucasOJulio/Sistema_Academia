package org.example.testes;

import org.example.Modalidade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModalidadeTest {

    @Test
    public void testGetNome() {
        Modalidade modalidade = new Modalidade("Musculação");
        assertEquals("Musculação", modalidade.getNome());
    }
    
    
    @Test
    public void testSetNome() {
        Modalidade modalidade = new Modalidade("Pilates");
        modalidade.setNome("Yoga");
        assertEquals("Yoga", modalidade.getNome());
    }
    //Teste modalidade
}
