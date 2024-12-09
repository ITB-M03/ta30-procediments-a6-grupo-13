package controllers.Exercici_2

import java.util.Scanner

fun main() {

}

fun menu(eleccion : Int) {
    println("que quiere hacer?")
}

fun buidarSala(sala : Array<CharArray>){
   for (fila in sala.indices){
       for (butaca in sala[fila].indices){
           sala[fila][butaca] = '_'
       }
   }
}

fun asientosDisponibles(sala : Array<CharArray>){
    println(sala)
}

fun reservaAsientos(sala : Array<CharArray>, scan : Scanner){
    println("introduzca la fila donde desee sentarse:")
    val fila = scan.nextInt()
    println("introduzca la butaca donde desee sentarse:")
    val butaca = scan.nextInt()
    if (sala[fila][butaca] == '_'){
        sala[fila][butaca] = 'X'
        println("Su asiento se ha reservado")
    }
    else println("Ese asiento está ocupado")
}

