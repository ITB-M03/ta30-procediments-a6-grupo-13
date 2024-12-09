package controllers.ex1
import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*



//Creamos la data class con sus valores
data class Punt(
    var x: Float,
    var y: Float
)

fun main() {

    /**
     * @author Denis Coello, Marc Cuenca, Yujiang Xia
     * @since 9/12/2024 v1.0.0
     * @param [Main] funcion principal que usaremos para llamar funciones secundarias
     * @param Scan Llamar funcion de escanear
     *
     * Pediremos al usuario las cordenadas de x , y
     * Luego compararemos si los numeros son iguales de los 2 puntos
     * Realizaremos un translado de punto respecto a los nuemeros que dara el usuario
     * el punto hara un escalado respecto a los nuemeros que dara el usuario
     *
     */

    //Abrimos el scanner
    val scan: Scanner = abrirScanner()

    //Pedimos los valores del punto inicial
    val x = pedirNumero("Introduce la coordenada X:", scan)
    val y = pedirNumero("Introduce la coordenada Y:", scan)

    //Creamos el primer punto
    val punt = Punt(x, y)

    //Pedimos las coordenadas para el segundo punto
    val x2 = pedirNumero("Introduce la coordenada X del segundo punto:", scan)
    val y2 = pedirNumero("Introduce la coordenada Y del segundo punto:", scan)

    //Creamos el segundo punto
    val punt2 = Punt(x2, y2)

    // Comprobamos si los puntos son iguales
    if (sonIguals(punt, punt2)) {
        println("Los puntos son iguales.")
    } else {
        println("Los puntos no son iguales.")
    }

    //Pedimos el desplazamiento
    val a = pedirNumero("Introduce un numero para desplazar la X:", scan)
    val b = pedirNumero("Introduce un numero para desplazar la Y:", scan)

    //Mostramos el punto inicial
    println("Punto inicial:")
    mostrarPuntos(punt)

    //Realizamos la translación
    trasladarPunto(punt, a, b)

    //Mostramos el punto final
    println("Punto después de la translación:")
    mostrarPuntos(punt)

    val multi = pedirNumero("Introduce el número de escala:", scan)
    escalado(punt, multi)
    mostrarPuntos(punt)

    //Cerramos el scanner
    cerrarScanner(scan)
}

/**
 * @param msg El menseje que mostrara al usuario
 * @param scan el numero que escanearemos que de el usuario
 * @param return devolvera el valor tipo Float
 */
//Función para pedir un número
fun pedirNumero(msg: String, scan: Scanner): Float {
    print(msg)
    return scan.nextFloat()
}

/**
 *  @param punt El punto cuyo valor se mostrará.
 */

//Función para mostrarpuntos
fun mostrarPuntos(punt: Punt) {
    println(String.format("(%.5f %.5f)", punt.x, punt.y))
}

/**
 * @param punt el punto al cual se le hara la translacion
 * @param a el valor que sumaremos a X
 * @param b el valor que sumaremos a Y
 */

//Función para trasladarpunto
fun trasladarPunto(punt: Punt, a: Float, b: Float) {
    punt.x += a
    punt.y += b
}

/**
 * @param punt el punto al cual se le hara el escalado
 * @param a el valor que multiplicaremos a X
 * @param b el valor que multiplicaremos a Y
 */

//Función para escalar del punto
fun escalado(punt: Punt, factor: Float) {
    punt.x *= factor
    punt.y *= factor
}

/**
 * @param punt1 el primer punto que compararemos
 * @param punt2 el segundo numero que compararemos
 * @return devolvera true si son iguales los puntos, false si son diferentes
 */
// Función para comparar si dos puntos son iguales
fun sonIguals(punt1: Punt, punt2: Punt): Boolean {
    return punt1.x == punt2.x && punt1.y == punt2.y
}
