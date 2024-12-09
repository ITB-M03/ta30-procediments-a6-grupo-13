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

    numero = mostrarPuntos(numero)
    numero2= mostrarPuntos(numero2)

    //Llamamos a la funcion de cerrar scanner
    cerrarScanner(scan)

}

//Funcion para pedir numero
fun pedirNumero (msg: String, scan: Scanner) : Float{
    //Le damos el valor al numero
    var num : Float
    //Imprimimos el mensaje
    print(msg)
    //Scaneamos el numero
    num = scan.nextFloat()
    //Devolvemos el numero
    return num
}

//Creamos la funcion mostrarPuntos
fun mostrarPuntos (x: Float) :Float {
    var a = String.format("%.5f", x)
    return a.toFloat()

}



