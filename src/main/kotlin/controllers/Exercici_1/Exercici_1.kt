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





    //Llamamos a la funcion de cerrar scanner
    cerrarScanner(scan)

}

//Funcion para pedir numero
fun pedirNumero (msg: String, scan: Scanner) : String{
    //Le damos el valor al numero
    var num : String
    //Imprimimos el mensaje
    print(msg)
    //Scaneamos el numero
    num = scan.nextLine()
    //Devolvemos el numero
    return num
}

//Creamos la funcion mostrarPuntos
fun mostrarPuntos (x: Float ,y:Float ) {

}



