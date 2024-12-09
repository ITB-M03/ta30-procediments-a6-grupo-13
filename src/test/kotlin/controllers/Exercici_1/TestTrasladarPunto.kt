package controllers.Exercici_1

import controllers.ex1.Punt
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TestTrasladarPunto {

    @Test
    fun trasladarPuntoTest1() {
        val punt = Punt(2.0f, 2.0f)
        val a = 2.0f
        val b = 2.0f

        controllers.ex1.trasladarPunto(punt, a, b)

        val esperado = Punt(4.0f, 4.0f)

        assertEquals(esperado, punt)
    }

    @Test
    fun trasladarPuntoTest2() {
        val punt = Punt(1.0f, 1.0f)
        val a = 3.0f
        val b = 5.0f

        controllers.ex1.trasladarPunto(punt, a, b)

        val esperado = Punt(4.0f, 6.0f)

        assertEquals(esperado, punt)
    }

    @Test
    fun trasladarPuntoTest3() {
        val punt = Punt(0.0f, 0.0f)
        val a = 1.0f
        val b = 1.0f

        controllers.ex1.trasladarPunto(punt, a, b)

        val esperado = Punt(1.0f, 1.0f)

        assertEquals(esperado, punt)
    }


}