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


    var numero_suma = pedirNumero("Introduce un numero:",scan)
    var numero2_suma = pedirNumero("Introduce un numero:",scan)


    suma(numero, numero2, numero_suma,numero2_suma)

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
    var puntos = String.format("%.5f %.5f ", punt.x, punt.y).toMutableList()
    return println(puntos)
}

//Creamos la funcion de suma
fun suma (x:Float, y: Float, a:Float, b:Float) {

    var sum1= x+a
    var sum2= y+b
    var puntos = String.format("%.5f %.5f ", a, b, c, d).toMutableList()
}



