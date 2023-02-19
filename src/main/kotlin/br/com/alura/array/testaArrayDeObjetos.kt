package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayDeObjetos(){

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    val salariosComAumento: Array<BigDecimal> = salarios.map {
        salario ->
        calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()

    println("Gasto inicial: $gastoInicial")

    val qtdMeses = "6".toBigDecimal()

    val gastoTotal = salariosComAumento.fold(gastoInicial){contador, salario ->
        contador + (salario * qtdMeses).setScale(2, RoundingMode.UP)
    }

    println("Gasto total em 6 meses será de: $gastoTotal")

    //val salariosOrdenados = salariosComAumento.sorted()

    //val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()

    //val media = tresUltimosSalarios.media()

    val mediaMaioresSalarios = salariosComAumento.
                sorted().
                takeLast(3).
                toTypedArray().
                media()

    println("Média dos três últimos salários: $mediaMaioresSalarios")

    val mediaMenoresSalarios = salariosComAumento.
            sorted().
            take(3).
            toTypedArray().
            media()

    println("Média dos três menores salários é: $mediaMenoresSalarios")


}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
    ) =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

