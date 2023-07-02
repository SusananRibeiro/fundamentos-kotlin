package controles
fun main(args: Array<String>) {
    val nota = 11

    when(nota) {
        10, 9 -> println("Fantátisco") // múltiplas seleções com o mesmo resultado
        8, 7 -> println("Parabéns")
        6, 5, 4 -> println("Tem como recuperar")
        in 0..3 -> println("Te vejo no próximo semestre") // usando o operador range
        else -> println("Nota inválida") // "else" seria o default do switch em Java
    }
}
