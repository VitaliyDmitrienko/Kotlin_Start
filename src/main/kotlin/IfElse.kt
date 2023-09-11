fun main() {
    val a = 10
    println("a = ${a}")
    println("<top>.main")
    println(comparision(a))

    var b =15
    println(comparision2(a,b))

    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }

    val a2 = 30
    when(a2){
        10 -> println("a2 = 10")
        20 -> println("a2 = 20")
        else -> println("a2 неопределенное значение")
    }

    val a3 = 10
    when(a3){
        in 10..19 -> println("a3 в диапазоне от 10 до 19")
        in 20..29 -> println("a3 в диапазоне от 20 до 29")
        !in 10..20 -> println("a3 вне диапазона от 10 до 20")
        else -> println("a3 неопределенное значение")
    }

    val a4 = 10
    val b4 = 5
    val c4 = 3
    when(a4){
        b4 - c4 -> println("a = b - c")
        b4 + 5 -> println("a = b + 5")
        else -> println("неопределенное значение")
    }
    val a5 = 10
    val b5 = 20
    when(a5 + b5){
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("Undefined")
    }

    val a6 = 10
    val b6 = 26
    when(val c6 = a6 + b6){
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        else -> println("c6 = $c6")
    }

    val a7 = 15
    val b7 = 6
    when{
        (b7 > 10) -> println("b7 больше 10");
        (a7 > 10) -> println("a7 больше 10")
        else -> println("и a7, и b7 меньше или равны 10")
    }

    val sum = 1000

    val rate = when(sum){
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println("rate=$rate")       // 15
}

fun comparision (argument: Int): Boolean {
    return if(argument == 10) {
        println("argument равен 10")
        true
    } else {println("argument не неравен 10"); false
    }
}

fun comparision2 (argument1: Int, argument2: Int): Boolean {
    return if(argument1 == argument2) {
        println("argument1 $argument1 равен argument2 $argument2")
        true
    } else {println("argument1 $argument1 не неравен argument2 $argument2"); false
    }


}