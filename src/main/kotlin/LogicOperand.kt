fun main () {
    val a = 11
    val b = 12
    val c: Boolean = a > b
    println(c)      // false - a меньше чем b

    val d = 35 > 12
    println(d)      // true - 35 больше чем 12

    val aa = true
    val bb = false
    val cc = aa and bb                         // false
    val dd = (11 >= 5) and (9 < 10)     // true
    println(cc)
    println(dd)

    val a1 = true
    val b1 = false
    val c1 = a1 xor b1                 // true
    val d1 = a1 xor (90 > 10)      // false

    val a2 = true
    val b2 = !a2  // false
    val c2 = !b2  // true

    val a3 = 5
    val b3 = a3 in 1..6       // true - число 5 входит в последовательность от 1 до 6
    val c3 = 4
    val d4 = c3 in 11..15     // false - число 4 НЕ входит в последовательность от 11 до 15

    val a4 = 8
    val b4 = a !in 1..6      // true - число 8 не входит в последовательность от 1 до 6

    
}