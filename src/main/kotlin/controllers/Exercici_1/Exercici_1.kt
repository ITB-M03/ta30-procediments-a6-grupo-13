package controllers.ex1
import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.*


//Creamos la lista data class con sus valores
data class Punt (
    var x: Float,
    var y: Float
)

fun main(){

    //Llamamos a la funcion de abrir scannner
    var scan : Scanner = abrirScanner()

    //Hacemos una funcion para pedir numero
    var numero = pedirNumero("Introduce un numero:",scan)
    var numero2 = pedirNumero("Introduce un numero:",scan)

    // Creamos el punto
    val punt = Punt(numero, numero2)
    //Mostramos los puntos por pantalla
    mostrarPuntos(punt)

    //Llamamos a la funcion de cerrar scanner
    cerrarScanner(scan)
}

//Funcion para pedir numero
fun pedirNumero (msg: String, scan: Scanner) : Float{
    //Imprimimos el mensaje
    print(msg)
    //Devolvemos el numero
    return scan.nextFloat()
}

//Creamos la funcion mostrarPuntos
fun mostrarPuntos (punt: Punt)  {
    var puntos = String.format("%.5f %.5f ", punt.x, punt.y)
    println(puntos)
}



