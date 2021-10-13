package com.example.generic

class Building2 <T, I> (val data : T, val secondData : I){
    fun printData(){
        return println("Data is $data $secondData")
    }
}

fun main() {
    val dataString = Building2("pertamina", 10)

    val dataInt = Building2(10, true)
    val dataBoolean = Building2(true, listOf("Armand", "Nur", "FIkhri"))
    dataString.printData()
    dataInt.printData()
    dataBoolean.printData()
}
