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




    //Llamamos a la funcion de cerrar scanner
    cerrarScanner(scan)

}

//Creamos la funcion mostrarPuntos
fun mostrarPuntos (x: Float, y: Float) {}

