fun main() {
    testaKotlin()

    val conta1 = Conta("Greg", 123, 321.0)
    conta1.saldo

    val conta2ComLabels = Conta(saldo=123.3, titular="Greg2")

}

class Conta(var titular: String, var numero: Int? = 111, saldo: Double) { // esse é o construtor primário
    var saldo = saldo
        private set(valor){
            field = valor // field é a variável saldo
        }
    init {
        println("executado na construção")
    }
}




fun testaKotlin(){
    println("testando")

    var podeSerModificada = "modificavel"
    val naoPodeSerModificada = "nao modificavel"

    var asVariaveisDevemSerInicializadas: Int = 1
    var saldo = 0
    saldo -= 10

    println("testando $podeSerModificada")

//          when {
//              saldo < 0 -> println("Saldo negativo")
//              saldo == 0 -> println("saldo zerado")
//              saldo > 0 -> println ("saldo positivo")
//          }
//          ou
//          println(
//              when {
//                  saldo < 0 -> "Saldo negativo"
//                  saldo == 0 -> "saldo zerado"
//                  else -> "saldo positivo"
//              }
//          )

    verificaSaldo(saldo)

    for (i in 2..4) {
        println(i)
    }

    for (i in 5 downTo 2)
        println(i)

    println("com steps")
    for (i in 1..4 step 2)
        println(i)

}
fun verificaSaldo(saldo: Int) {
    when {
        saldo < 0 -> println("Saldo negativo")
        saldo == 0 -> println("saldo zerado")
        saldo > 0 -> println("saldo positivo")
    }
}