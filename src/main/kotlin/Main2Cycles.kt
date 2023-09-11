fun main() {
    val name = "stranger"        // Declare your first variable
    println("Hi, $name!")        // ...and use it!
    print("Current count:")
    for (i in 0..10) {       // Loop over a range from 0 to 10
        print("raw i: $i\n")
        print("i+50=${i + 50}\n")
    }

//    for (i in 0..10) {           // Loop over a range from 0 to 10
//        print(" $i\n")
//    }

    for (j in 5 until 100 step 7)
        println("j=$j")

    for (k in 200 downTo 15 step 13)
        println("k=$k.")

    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }

    var i = 10
    while(i > 0){
        println(i*i)
        i--;
    }

    var i2 = -1
    do{
        print("${i2*i2}\t")
        i2++;
    }
    while(i2 in 0..10)
    println()

    for(n in 1..8){
        if(n == 5) continue;
        print(n*n); print("\t")
    }
    println()

    for(n in 1..10){
        if(n == 5) break;
        print(n * n); print("\t")
    }
    println()

    val numbers1 = Array(5) { 3 } // [5, 5, 5]
    val numbers2 = Array(5, {5}) // [5, 5, 5]
    numbers1.forEach {
        println(it)
        numbers2.forEach { println(it) }}

    repeat(10){
        println("Васька! Иди жрать!")
    }

}