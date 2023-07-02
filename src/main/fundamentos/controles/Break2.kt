package controles
fun main(args: Array<String>) {
    externo@for (i in 1..15) {
        for (j in 1..15) {
            if (i == 2 && j == 9) break@externo // Break Rotulado, não deve ser usado, somente para fins didáticos
            println("$i $j")
        }
    }
    println("Fim!")
}
