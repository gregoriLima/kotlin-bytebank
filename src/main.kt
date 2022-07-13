fun main() {

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
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