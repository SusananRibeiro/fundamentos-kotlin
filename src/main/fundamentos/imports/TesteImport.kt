package imports

import imports.pacoteA.simplesFuncao as funcaoSimples // "as" para mudar o nome da função
import imports.pacoteA.Coisa
import imports.pacoteA.FaceMoeda.CARA
import imports.pacoteB.*
fun main(args: Array<String>) {
    kotlin.io.println(funcaoSimples("Ok")) // NÃO é preciso colocar explicitamente "kotlin.io." é só para exemplificar
    val coisa = Coisa("Bola") // instaciar um objeto do tipo "Coisa"
    println(coisa.nome)
    println(CARA)
    println("${soma(2, 3)} ${subtracao(4, 6)}")
}