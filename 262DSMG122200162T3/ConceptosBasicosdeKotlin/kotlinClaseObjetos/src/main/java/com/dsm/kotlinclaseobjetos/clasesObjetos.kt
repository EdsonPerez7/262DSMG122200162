package com.dsm.kotlinclaseobjetos

class SmartDevice (val name: String, val category: String){

    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
                
        }
    }
    fun turnOn() {
        println("Smart device es turned on")
    }
    fun turnOff() {
        println("Smart device es turned off")
    }

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
}

fun main() {
    val smartTvDevice = SmartDevice(
        name = "Android TV",
        category = "Entertaiment",
        statusCode = 1
    )
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()


}