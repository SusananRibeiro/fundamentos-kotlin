package controles
fun main(args: Array<String>) {
    val nota: Double = 6.3

    // Usando o Operador Range ".."
    if(nota in 9.0..10.0) {
        println("Fantátisco")
    } else if (nota in 7.0..8.9) {
        println("Parabéns")
    } else if (nota in 4.0..6.9) {
        println("Tem como recuperar")
    } else if (nota in 0.0..3.9) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }

    println(5 in 7..4) // false --> sempre do menor para o maior
    println(5 in 4..7) // true
}
