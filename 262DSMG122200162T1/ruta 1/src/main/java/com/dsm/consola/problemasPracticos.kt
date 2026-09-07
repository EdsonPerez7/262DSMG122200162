package com.dsm.consola

fun main() {
    println("==== EJECUCIÓN DE TODOS LOS EJERCICIOS ====\n")

    mensaje()
    correcion()
    plantilla()
    sumaCadenas()
    formatoMensajes()
    sumas()
    podometro()
    comparacion()
    modularidad()

    println("==========================================")
}

fun mensaje() {
    println("Use the val keyword when the value doesn't change. \n" +
            "Use the var keyword when the value can change.\n" +
            "When you define a function, you define the parameters that can be passed to it. \n" +
            "When you call a function, you pass arguments for the parameters.")
    println()
}

fun correcion() {
    println("New chat message from a friend")
    println()
}

fun plantilla() {
    // Usamos var para que permitan cambios
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"

    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
    println()
}

fun sumaCadenas() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $total")
    println()
}

fun formatoMensajes() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun sumas() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun podometro() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
    println()
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun comparacion() {
    val prueba1 = compararTiempoUso(timeSpentToday = 300, timeSpentYesterday = 250)
    println("¿Pasé más tiempo hoy que ayer? (300 vs 250): $prueba1")

    val prueba2 = compararTiempoUso(timeSpentToday = 300, timeSpentYesterday = 300)
    println("¿Pasé más tiempo hoy que ayer? (300 vs 300): $prueba2")

    val prueba3 = compararTiempoUso(timeSpentToday = 200, timeSpentYesterday = 220)
    println("¿Pasé más tiempo hoy que ayer? (200 vs 220): $prueba3")
    println()
}

fun compararTiempoUso(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    // El operador '>' ya devuelve automáticamente un valor true o false
    return timeSpentToday > timeSpentYesterday
}

fun modularidad() {
    // Llamamos a la función para cada ciudad pasando sus datos específicos
    mostrarClima(ciudad = "Ankara", minima = 27, maxima = 31, probabilidadLluvia = 82)
    mostrarClima(ciudad = "Tokyo", minima = 32, maxima = 36, probabilidadLluvia = 10)
    mostrarClima(ciudad = "Cape Town", minima = 59, maxima = 64, probabilidadLluvia = 2)
    mostrarClima(ciudad = "Guatemala City", minima = 50, maxima = 55, probabilidadLluvia = 7)
    println()
}

// Función reutilizable para imprimir el clima de cualquier ciudad
fun mostrarClima(ciudad: String, minima: Int, maxima: Int, probabilidadLluvia: Int) {
    println("City: $ciudad")
    println("Low temperature: $minima, High temperature: $maxima")
    println("Chance of rain: $probabilidadLluvia%")
    println() // Deja un espacio en blanco entre ciudades
}
