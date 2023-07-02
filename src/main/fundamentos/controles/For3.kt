package controles
fun main(args: Array<String>) {
    for(i in 0..100 step 5) { // ascendente - "step" é para contar de 5 em 5
        println(i)
    }

    for(i in 100 downTo 0 step 5) { // descendente - "step" é para contar de 5 em 5
        println(i)
    }
}
