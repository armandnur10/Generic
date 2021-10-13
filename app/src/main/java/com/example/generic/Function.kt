package com.example.generic

//class Function(val name:String) {
//    fun <T> sayHello(Hii: T){
//        println("Hello $Hii, my name is $name")
//    }
//}
//
//fun main() {
//    val nama = Function("armand")
//    nama.sayHello("Kyoukai")
//}

class Function(val name:String = "Armand") {
    fun <T> sayHello(Hii: T){
        println("Hello $Hii, my name is $name")
    }
}

fun main() {
    val nama = Function()
    nama.sayHello("Kyoukai")
}
