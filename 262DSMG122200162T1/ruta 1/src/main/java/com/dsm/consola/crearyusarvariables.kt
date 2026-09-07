package com.dsm.consola

fun main() {
    println("==== EJECUCIÓN DE TODOS LOS EJERCICIOS ====\n")

    variable()
    totalmensajes()
    plusplus()
    menosmenos()
    otrosTipos()
    boleano()

    println("==========================================")
}
fun variable() {

    val count: Int = 2
    println("Variable: $count")
}

fun totalmensajes() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

fun plusplus() {
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
}

fun menosmenos() {
    var count = 10
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}

fun otrosTipos() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

fun boleano() {
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}
