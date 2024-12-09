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
    //Abrimos el scanner
    val scan: Scanner = abrirScanner()

    //Pedimos los valores del punto inicial
    val x = pedirNumero("Introduce la coordenada X:", scan)
    val y = pedirNumero("Introduce la coordenada Y:", scan)

    // Creamos el punto inicial
    val punt = Punt(x, y)

    //Pedimos el desplazamiento
    val a = pedirNumero("Introduce el desplazamiento en X:", scan)
    val b = pedirNumero("Introduce el desplazamiento en Y:", scan)

    //Mostramos el punto inicial
    println("Punto inicial:")
    mostrarPuntos(punt)

    //Realizamos la translación
    trasladarPunto(punt, a, b)

    //Mostramos el punto final
    println("Punto después de la translación:")
    mostrarPuntos(punt)

    val multi = pedirNumero("Introduce el numero de escala:", scan)
    escalado(punt,multi)
    mostrarPuntos(punt)

    //Cerramos el scanner
    cerrarScanner(scan)
}


//Función para pedir un número
fun pedirNumero(msg: String, scan: Scanner): Float {
    print(msg)
    return scan.nextFloat()
}

//Función para mostrar puntos
fun mostrarPuntos(punt: Punt) {
    println(String.format("(%.5f, %.5f)", punt.x, punt.y))
}

//Funcion para hacer la suma y transladarlos
fun trasladarPunto(punt: Punt, a: Float, b: Float) {
    punt.x += a
    punt.y += b
}

//Funcion para hacer la suma y transladarlos
fun escalado(punt: Punt, factor: Float) {
    punt.x *= factor
    punt.y *= factor
}
