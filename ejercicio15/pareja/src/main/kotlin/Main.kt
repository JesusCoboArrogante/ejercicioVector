fun main(args: Array<String>) {
    val parejas = arrayOf("1","1","2","2","3","3","4","4","5","5",)
    val ver = arrayOf("X","X","X","X","X","X","X","X","X","X")
    var numeroUno = 0
    var numeroDos = 0
    arrayPareja(ver)
    do {

        println()
        println("introduce un numero")
        numeroUno = readln().toIntOrNull()?:0

        println("introduce otro numero")
        numeroDos= readln().toIntOrNull()?:0

        nose(parejas, numeroUno, numeroDos,ver)

    }while (fin(parejas, ver))



}
fun arrayPareja(ver: Array<String>){
    for (i in ver.indices){
        print(ver[i])
    }
}


fun nose (parejas: Array<String>, numeroUno: Int, numeroDos: Int, ver: Array<String>){
    if (parejas[numeroUno] == parejas[numeroDos]){
        ver[numeroUno] = parejas[numeroUno]
        ver[numeroDos] = parejas[numeroDos]
        arrayPareja(ver)


    }else if (parejas[numeroUno] != parejas[numeroDos]){
        ver[numeroUno] = parejas[numeroUno]
        ver[numeroDos] = parejas[numeroDos]
        arrayPareja(ver)
        //poner el tiempo un segundo
        ver[numeroUno] = "X"
        ver[numeroDos] = "X"
        println()
        arrayPareja(ver)



    }

}

fun fin(parejas: Array<String>, ver: Array<String>): Boolean {
    var continuar = true
    if (parejas.contentEquals(ver)){
        continuar = false
    }else{
        continuar = true
    }
    return continuar

}



