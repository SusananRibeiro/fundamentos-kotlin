package operadores
import java.util.*
fun main(args: Array<String>) {
    println("Banana" === "Banana") // true -> igualdade
    println(3 !== 2) // true -> diferente
    println(3 < 2) // false -> menor
    println(3 > 2) // true -> maior
    println(3 <= 2) // false -> menor ou igual
    println(3 >= 2) // true -> maior ou igual

    val d1 = Date(0)
    val d2 = Date(0)

    // Igualdade referencial -> se o endereço de memória dos objetos são iguais
    println("Resultado com '===' ${d1 === d2}") // false -> os endereços de memórias são diferentes

    // Igualdade estrutural -> se o conteúdo/valores/dados dos objetos são iguais
    println("Resultado com '==' ${d1 == d2}") // true -> o conteúdo das duas datas são iguais
    // println("Resultado com '==' ${d1.equals(d2)}")
}
