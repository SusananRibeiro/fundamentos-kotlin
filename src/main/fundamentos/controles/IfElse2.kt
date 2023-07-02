package controles
fun main(args: Array<String>) {
    val num1: Int = 7
    val num2: Int = 3
    // IF como expressão
    // val maiorValor = if(num1 > num2) num1 else num2 --> Poderia ser feito desta forma também
    val maiorValor = if(num1 > num2) {
        println("processando if...")
        num1
    } else {
        println("processando else...")
        num2
    }
    println("O maior valor é $maiorValor.")
}