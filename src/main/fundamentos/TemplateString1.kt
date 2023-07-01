fun main(args: Array<String>) {
    val aprovados = listOf("João", "Maria", "Pedro")
    println("O primeiro colocado foi ${aprovados[0]}.") // usando o template string
    print("O primeiro colocado foi " + aprovados[0] + ".") // Também é possível concatenar, sem usar o template string
}