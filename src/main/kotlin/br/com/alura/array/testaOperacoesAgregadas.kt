package br.com.alura.array

import kotlin.math.roundToInt

fun testaOperacoesAgregadas(){

    val idades : IntArray = intArrayOf(13, 17, 44, 38, 57, 67)

    println("A maior idade é de: ${idades.max()}. A menor idade é: ${idades.min()}")

    println("A média das idades é de: ${idades.average().roundToInt()}")

    val existeMenor = idades.any{it <= 18}

    if(existeMenor){
        println("Existe menor.")
    }else{
        println("Todos são maiores.")
    }

    val menores = idades.filter { it <= 17 }

    println("$menores ")

    val busca = idades.find { it == 18 }

    println("$busca ")

}