package org.example.testes;

import org.example.modelo.SistemaAcademia;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaAcademiaTest {
    @Test
    public void testStatus() {
        SistemaAcademia sa = new SistemaAcademia();
        assertEquals("Sistema de Academia operando.", sa.status());
    }
}