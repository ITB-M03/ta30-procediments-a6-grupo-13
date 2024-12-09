package controllers.Exercici_2

import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.Scanner

fun main() {
    val scan = abrirScanner()
    val sala = inicializarSala()
    ejecutarMenu(sala, scan)
    cerrarScanner(scan)
}

fun inicializarSala(): MutableList<MutableList<Char>> {
    return MutableList(20) { MutableList(15) { '_' } }
}

fun mostrarMenu() {
    println(
        """
        Elija una de las siguientes opciones:
        1. Vaciar sala
        2. Ver asientos disponibles
        3. Reservar asiento
        4. Salir
        """.trimIndent()
    )
    print("Escoga una opción NUMÉRICA: ")
}

fun ejecutarMenu(sala: MutableList<MutableList<Char>>, scan: Scanner) {
    var salir = false
    while (!salir) {
        mostrarMenu()
        when (scan.nextInt()) {
            1 -> vaciarSala(sala)
            2 -> mostrarAsientosDisponibles(sala)
            3 -> reservarAsiento(sala, scan)
            4 -> salir = true
            else -> println("Opción no válida, por favor intente de nuevo.")
        }
    }
}

fun vaciarSala(sala: MutableList<MutableList<Char>>) {
    for (fila in sala.indices) {
        for (butaca in sala[fila].indices) {
            sala[fila][butaca] = '_'
        }
    }
    println("La sala ha sido vaciada.")
}

fun mostrarAsientosDisponibles(sala: MutableList<MutableList<Char>>) {
    println("Asientos disponibles:")
   for(fila in sala){
       println(fila.joinToString(" "))
   }
}

fun reservarAsiento(sala: MutableList<MutableList<Char>>, scan: Scanner) {
    println("Introduzca el número de fila (0-19):")
    val fila = scan.nextInt()
    println("Introduzca el número de butaca (0-14):")
    val butaca = scan.nextInt()

    if (fila in 0 until sala.size && butaca in 0 until sala[fila].size) {
        if (sala[fila][butaca] == '_') {
            sala[fila][butaca] = 'X'
            println("Su asiento ha sido reservado.")
        } else {
            println("Ese asiento está ocupado.")
        }
    } else {
        println("Fila o butaca fuera de rango. Intente nuevamente.")
    }
}
