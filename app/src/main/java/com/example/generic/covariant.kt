package com.example.generic
/*covariant berarti kita melakukan subtitusi dengan supertype(parent)
tidak semua jenis class generik yang mendukung covariant, hanya class generic yang menggunakan generic parameter
tipe sebagai return type function
untuk kata kuncinya kita akan menggunakan out */

class covariant <out T> (val data : T) {

    fun data() : T {
        return data
    }
}


fun main() {
    val data1 : covariant<String> = covariant("Armand")
    val data2 : covariant<Any> = data1
}