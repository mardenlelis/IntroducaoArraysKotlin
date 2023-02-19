fun testaArrayIdades(){

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 77)

    var idadeAtual: Int = 0

    for (idade in idades){
        if(idade > idadeAtual){
            idadeAtual = idade
        }
    }

    println("Maior idade é: $idadeAtual")

    var menorIdade = Int.MAX_VALUE

    idades.forEach { idade ->
        if(idade < menorIdade){
            menorIdade = idade
        }
    }

    println("A menor idade é: $menorIdade")

}