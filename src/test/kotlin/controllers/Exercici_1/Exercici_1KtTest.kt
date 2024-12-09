package controllers.Exercici_1

import controllers.ex1.Punt
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class Exercici_1KtTest {

    @Test
    fun trasladarPunto() {
        //Creamos un punto con coordenadas iniciales (1.0f, 2.0f)
        val punt = Punt(1.0f, 2.0f)

        //Definimos los desplazamientos a y b
        val a = 2.0f
        val b = 1.0f

        // Desplazamos el punto
        trasladarPunto(punt, a, b)

        //Calculamos las coordenadas
        val esperadoX = 1.0f + a // Debería ser 3.0f
        val esperadoY = 2.0f + b // Debería ser 3.0f

        //Comprobamos si las coordenadas X y Y coinciden con las esperadas
        assertEquals(esperadoX, punt.x)
        assertEquals(esperadoY, punt.y)
    }
}
