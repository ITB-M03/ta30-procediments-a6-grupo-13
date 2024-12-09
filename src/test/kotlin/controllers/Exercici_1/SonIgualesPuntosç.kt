package controllers.Exercici_1

import controllers.ex1.Punt
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class SonIgualesPuntos {

    @Test
    fun sonIguals1() {
        //Creamos dos puntos con diferentes cordenadas
        val esperado = Punt(3.0f, 3.0f)
        val esperado2 = Punt(3.0f, 3.0f)


        assertEquals(esperado, esperado2)

        //Creamos otras dos puntos con diferentes coordenadas
        val esperado3 = Punt(3.0f, 3.0f)
        val esperado4 = Punt(3.0f, 3.0f)


        assertEquals(esperado3, esperado4)
    }

    @Test
    fun sonIguals2() {
        //Creamos dos puntos con diferentes cordenadas
        val esperado = Punt(9999.0f, 9999.0f)
        val esperado2 = Punt(9999.0f, 9999.0f)


        assertEquals(esperado, esperado2)

        //Creamos otras dos puntos con diferentes coordenadas
        val esperado3 = Punt(-9999.0f, -9999.0f)
        val esperado4 = Punt(-9999.0f, -9999.0f)


        assertEquals(esperado3, esperado4)
    }

    @Test
    fun sonIguals3() {
        //Creamos dos puntos con diferentes cordenadas
        val esperado = Punt(999999.0f, 999999.0f)
        val esperado2 = Punt(999999.0f, 999999.0f)


        assertEquals(esperado, esperado2)

        //Creamos otras dos puntos con diferentes coordenadas
        val esperado3 = Punt(-999999.0f, -999999.0f)
        val esperado4 = Punt(-999999.0f, -999999.0f)


        assertEquals(esperado3, esperado4)
    }
}
