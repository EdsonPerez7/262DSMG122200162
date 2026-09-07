package com.dsm.nulabilidadkotlin

fun main() {
    println("\n\n----- Ejercicios Nullabilidad -----")

    println("\n--- Usando Null ---")
    primerNull()
    actorFavorito()
    intAnulable()
    println("\n--- Usando Length ---")
    cantidadCaracteres()
    println("\n--- Usando Null / IF-ELSE ---")
    nuloIfElse()
    nuloIfElse2()
    operadorElvis()
}
fun primerNull() {
    val favoriteActor = null
    println(favoriteActor)
}

fun actorFavorito() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}

fun intAnulable() {
    var number: Int? = 10
    println(number)

    number = null
    println(number)
}

fun cantidadCaracteres() {
    var favoriteActor: String = "Sandra Oh"
    println(favoriteActor.length)
}

fun nuloIfElse() {
    var favoriteActor: String? = null

    if(favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }
}

fun nuloIfElse2() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

fun operadorElvis() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}