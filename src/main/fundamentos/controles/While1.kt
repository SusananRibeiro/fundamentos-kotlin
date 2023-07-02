package controles
fun main(args: Array<String>) {
    var opcao: Int = 0

    while(opcao != 1) {
        val line = readLine() ?: "0" // vai ler uma entrada do usuário no console
        opcao = line.toIntOrNull() ?: 0 // precisa colocar o operador elvis na variável "line", se não dá erro (val line = readLine() ?: "0")
        println("Você escolheu a opção $opcao")
    }
    println("Até a próxima!")
}
