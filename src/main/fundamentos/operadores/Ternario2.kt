package operadores
fun obterResultado(nota : Double) : String = if(nota >= 7.0) "Passou" else "Reprovou" // Usar o “IF” para simular um operador ternário
fun main(args: Array<String>) {
    print(obterResultado(8.3))
}
