package br.com.alura.array

fun testaArrayDePedidos(){

    val pedidos = longArrayOf(1300012, 1100013, 1200199, 1200222, 1100345, 1000012)

    val pedidosSelecionados = pedidos.find { it <= 1200000 }

    println("$pedidosSelecionados")

}