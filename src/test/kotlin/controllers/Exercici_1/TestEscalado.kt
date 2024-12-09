package controllers.Exercici_1

import controllers.ex1.Punt
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TestEscalado {

    @Test
    fun escaladoTest() {
        val punt = Punt(2.0f, 2.0f)
        val factor = 2.0f

        controllers.ex1.escalado(punt, factor)

        val esperado = Punt(4.0f, 4.0f)

        assertEquals(esperado, punt)
    }

    @Test
    fun escaladoTest2() {
        val punt = Punt(1.0f, 4.0f)
        val factor = 0.5f

        controllers.ex1.escalado(punt, factor)

        val esperado = Punt(0.5f, 2.0f)

        assertEquals(esperado, punt)
    }

    @Test
    fun escaladoTest3() {
        val punt = Punt(5.0f, 5.0f)
        val factor = 1.0f

        controllers.ex1.escalado(punt, factor)

        val esperado = Punt(5.0f, 5.0f)

        assertEquals(esperado, punt)
    }
}