fun main () {
    val test1 = "Hello"
//    test1 = "Goodbye"
    val test2 = "World"

    println("$test1 $test2 !!!")

    var test3 = "Goodbye"
    println(message = "$test3 $test2 !!!")
    test3 = "WTF"
    println(message = "$test3 $test2 ???")

    val a: Byte = -128 // Byte: хранит целое число от -128 до 127 и занимает 1 байт
    val b: Short = -32768 // Short: хранит целое число от -32 768 до 32 767 и занимает 2 байта
    val c: Int = -2147483648 // Int: хранит целое число от -2 147 483 648 (-231) до 2 147 483 647 (231 - 1) и занимает 4 байта
    val d: Long = 9223372036854775807 // Long: хранит целое число от –9 223 372 036 854 775 808 (-263) до 9 223 372 036 854 775 807 (263-1) и занимает 8 байт
    println("a=$a") // -10
    println("b=$b") // 45
    println("c=$c") // -250
    println("d=$d") // 30000
    print("a+b= ")
    println(a+b)

    val Ua: UByte = 255U // UByte: хранит целое число от 0 до 255 и занимает 1 байт
    val Ub: UShort = 65535U // UShort: хранит целое число от 0 до 65 535 и занимает 2 байта
    val Uc: UInt = 250U // UInt: хранит целое число от 0 до 232 - 1 и занимает 4 байта
    val Ud: ULong = 30000U // ULong: хранит целое число от 0 до 264-1 и занимает 8 байт
    println("Ua=$Ua") // 10
    println("Ub=$Ub") // 45
    println("Uc=$Uc") // 250
    println("Ud=$Ud") // 30000

    var Ue: UByte = 255U
    println("raw Ue=$Ue")
    Ue++
    println("var after increment Ue=$Ue")

    val address: Int = 0x0A1    // 161
    println("Hex-address: 0x0A1 is $address") // 161

    val bina: Int = 0b0101    // 5
    val binb: Int = 0b1011     // 11
    println("bin a: 0b0101 = $bina")      // 5
    println("bin b: 0b1011 = $binb")      // 11

    val height: Double = 1.78
    val pi: Float = 3.14F // Float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
    println("Double is: $height")      // 1.78
    println("Float is: $pi")         // 3.14

    val double: Double = 23.1e3
    println(double)      // 23 000
    val g: Double = 23.002e-3
    println(g)      // 0.023

    val atrue: Boolean = true
    val bfalse: Boolean = false
    println("$atrue + $bfalse")

    val chara: Char = 'A'
    val charb: Char = 'B'
    val charc: Char = 'C'
    var message: String = ""
    var message2: String = ""
    message += message + chara + charb + charc

    message2 += message + chara  + charb + charc
    println(message)
    println(message2)
    var message3: String = ""
    println(message + message2)
    println("$message3 + ${message + message2}")

    val bigString = """
  |Таким образом
  |вы можете получить строку,
  |содержащую
  |несколько
  |строк.
  """.trimMargin()
    println(bigString)

    val text: String = """
                        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
                    """
    println(text)

    val firstName = "Tom"
//    firstName = "Thomas"
    val lastName = "Smith"
    val welcome = "Hello, $firstName $lastName"
    println(welcome)    // Hello, Tom Smith

    var name: Any = "Tom"
    println(name)   // Tom
    name = 6758
    println(name)   // 6758

    print("Введите имя: ")
    val name2 = readLine()

    println("Ваше имя: $name2")

}