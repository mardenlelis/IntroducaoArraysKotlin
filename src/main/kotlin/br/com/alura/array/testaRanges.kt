package br.com.alura.array

fun testaRanges(){

    val range : IntRange = 1.rangeTo(100)

    for(i in range){
        print("$i, ")
    }

    println()

    val rangePar = 0..100 step 2

    for(i in rangePar){
        print("$i, ")
    }

    println()

    val parDecrescente = 100 downTo 0 step 2

    for (i in parDecrescente){
        print("$i, ")
    }

}
