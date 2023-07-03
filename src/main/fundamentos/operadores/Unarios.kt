package operadores
fun main(args: Array<String>) {
    var num1: Int = 1
    var num2: Int = 2

    num1++
    println(num1) // 2
    --num1
    println(num1) // 1

    // Incremento e decremento
    println(++num1 == num2--) // true -> dessa maneira é só para exemplo, no dia a dia não se faz dessa dorma
    println(num1 == num2) // false
}
