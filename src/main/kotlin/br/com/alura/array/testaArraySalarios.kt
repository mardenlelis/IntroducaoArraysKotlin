package br.com.alura.array

fun testaArraySalarios(){

    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 10000.0)

    var maiorSalario: Double = Double.MIN_VALUE

    salarios.forEach { salario ->
        if(salario > maiorSalario){
            maiorSalario = salario
        }
    }

    println("O maior salário é: $maiorSalario")

    val aumento : Double = 1.1

    for(indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed{i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())

}