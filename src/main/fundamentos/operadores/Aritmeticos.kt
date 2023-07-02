package operadores
fun main(args: Array<String>) {
    val (v1, v2, v3, v4) = listOf(3, 5, 1, 15) // "(v1, v2, v3, v4)" é o operador Destructuring

    val soma = v1 + v2 + v3 + v4
    val subtracao  = v4 - v2
    val divisao = v4 / v1
    val multiplicacao = v1 * v2
    val modulo = v1 % 2

    println("Soma: $soma, Subtração: $subtracao, Divisão: $divisao, Multiplicação: $multiplicacao, Modulo: $modulo.")
}
