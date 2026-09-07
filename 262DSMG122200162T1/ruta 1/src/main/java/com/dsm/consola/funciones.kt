package com.dsm.consola

fun main() {
    println("==== EJECUCIÓN DE TODOS LOS EJERCICIOS ====\n")

    println(saludoCumple("Rover", 5))
    println(saludoCumple(name = "Rex", age = 2))

    println(saludoCumple2(age = 4))

    println("==========================================")
}

fun saludoCumple(name: String, age: Int): String {
    val nameGreeting = "Feliz Cumpleaños, $name!"
    val ageGreeting = "Ahora tienes $age años!"
    return "$nameGreeting\n$ageGreeting"
}

fun saludoCumple2(name: String = "Juan", age: Int): String {
    return "Feliz Cumpleaños, $name! Ahora tienes $age años!"
}