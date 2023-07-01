fun main(args: Array<String>) {
    // Tipos Numéricos Inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_807

    // Tipos Numéricos Reais
    val num5: Float = 3.14F // precisa colocar a letra "F" no final
    val num6: Double = 3.14

    // Tipo caractere
    val char: Char = '?' // Outros exemplos... '1', 'g', ' '

    // Tipo Booleano
    val boolean: Boolean = true // ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))
    println(2 is Int) // true --> por padrão qualquer literal numérico é do tipo inteiro
    println(2147483648 is Long) // true --> porque passou do tamanho máximo do inteiro, então é long
    println(1.0 is Double) // true --> Por padrão qualquer literal numérico real/ponto flutuante é do tipo Double

    // Tudo é Objeto
    println(10.dec()) // 9 --> ".dec()" é para decrementar o valor de um número

}