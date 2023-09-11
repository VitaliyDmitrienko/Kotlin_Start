fun main() {
    val name = "stranger"        // Declare your first variable
    println("Hi, $name!")        // ...and use it!
    print("Current count:")
    for (i in 0..10) {           // Loop over a range from 0 to 10
        print("raw i: $i\n")
        print("i+50: ${i+50}\n")
    }

//    for (i in 0..10) {           // Loop over a range from 0 to 10
//        print(" $i\n")
//    }

    for (j in 5 until 100 step 7)
        println(j)

    for (k in 200 downTo 15 step 13)
        println()

}