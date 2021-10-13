package com.example.generic
/*Terkadang kiat ingin membatasi data yang boleh digunakan di generic parameter type
kita bisa menambahkan constraint di generic parameter type dengan menyebutkan type yang diperbolehakn secara otomatis,
tyepdata yang bisa digunakan adalah type yang sudah kta sebutkan secara default constraint type untuk
generic parameter tyoe untuk generic paraeter type adalah any, sehingga semua type data bisa digunakan*/
open class employee
class manager: employee()

class VicePresident: employee()

class Company<T :employee> (val employee: T)

fun main() {
    val data1 = Company(manager())
    val data2 = Company(VicePresident())
}