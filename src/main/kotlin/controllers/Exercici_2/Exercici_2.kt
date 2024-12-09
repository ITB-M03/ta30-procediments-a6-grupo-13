package controllers.Exercici_2

import utilities.abrirScanner
import utilities.cerrarScanner
import java.util.Scanner

fun main() {
    /**
     *
     * Función principal que ejecuta el programa de gestión de una sala de asientos.
     * Inicializa la sala con asientos vacíos y muestra un menú con opciones al usuario.
     * El usuario puede elegir entre vaciar la sala, ver los asientos disponibles,
     * reservar un asiento o salir del programa.
     *
     * @param scan Objeto Scanner utilizado para leer las opciones y entradas del usuario.
     *
     */
    val scan = abrirScanner()
    val sala = inicializarSala()
    ejecutarMenu(sala, scan)
    cerrarScanner(scan)
}

/**
 * Inicializa la sala de asientos con 20 filas y 15 columnas, donde todos los asientos
 * están inicialmente vacíos, representados por el carácter '_'.
 *
 * @return Una lista mutable de listas, que representa la sala de asientos.
 */
fun inicializarSala(): MutableList<MutableList<Char>> {
    return MutableList(20) { MutableList(15) { '_' } }
}

/**
 * Muestra el menú de opciones disponible para el usuario, con las opciones:
 * 1. Vaciar la sala
 * 2. Ver asientos disponibles
 * 3. Reservar un asiento
 * 4. Salir del programa
 */
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

/**
 * Controla la ejecución del programa según la opción que seleccione el usuario
 * Dependiendo de la opción, realiza una de las siguientes acciones:
 * - Vaciar la sala de asientos
 * - Mostrar los asientos disponibles
 * - Reservar un asiento
 * - Salir del programa
 *
 * @param sala La sala de asientos donde se almacenan las reservas.
 * @param scan el numero que escanearemos que dara el resultado por pantalla
 */
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

/**
 * Vacía la sala de asientos, lo que significa que todos los asientos
 * volverán a estar disponibles (se representarán con el carácter '_').
 *
 * @param sala La sala de asientos que se va a vaciar.
 */
fun vaciarSala(sala: MutableList<MutableList<Char>>) {
    for (fila in sala.indices) {
        for (butaca in sala[fila].indices) {
            sala[fila][butaca] = '_'
        }
    }
    println("La sala ha sido vaciada.")
}

/**
 * Muestra los asientos disponibles en la sala. Los asientos vacíos se
 * representan como '_', y los asientos reservados como 'X'.
 *
 * @param sala La sala de asientos que se va a mostrar.
 */
fun mostrarAsientosDisponibles(sala: MutableList<MutableList<Char>>) {
    println("Asientos disponibles:")
    for (fila in sala) {
        println(fila.joinToString(" "))
    }
}

/**
 * Permite al usuario reservar un asiento en la sala. El usuario debe
 * ingresar el número de fila y el número de butaca. Si el asiento está
 * vacío, sse marca con 'X' sino se informa al
 * usuario que el asiento ya está ocupado.
 *
 * @param sala La sala de asientos donde se hara la reserva.
 * @param scan el numero que escanearemos que dara el resultado por pantalla
 */
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
