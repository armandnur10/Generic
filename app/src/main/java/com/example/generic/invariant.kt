package com.example.generic

/*secara default saat kita membuat generic parameter type,
sifat parameter tersebut adalah invariant
invariant = tidak boleh subtitusi subtype(child) atau supertype(parent)*/
class invariant <T> (val data : T)

fun main() {
    val data: invariant<String> = invariant("armand")
    val data2 : invariant<Any> = invariant(9)
}