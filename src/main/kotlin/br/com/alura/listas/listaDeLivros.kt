package br.com.alura.listas

fun testaLivros(){

    val livro1 = Livro(
        "Iracema",
         "José de Alencar",
         1865,
         "EditoraA")

    val livro2 = Livro(
        "Memória Póstumas de Brás Cubas",
        "Machado de Assis",
        1861,
        "EditoraA")

    val livro3 = Livro(
        "Grande Sertão Veredas",
        "Guimarães Rosa",
        1941,
         "Editora123")

    val livro4 = Livro(
        "Drácula",
        "Bram Stocker",
        1888,
        "Darkside")

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(Livro("Sagarana", "João Guimarães Rosa", 1946))

    livros.imprimeComMarcadores()

    val orndenadoAnoPublicacao = livros.sorted()

    orndenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.filter { it.autor.contains("Guimarães Rosa")}
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()


}

fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor}"
    }

    println("#### Lista de Livros #### \n $textoFormatado")
}

