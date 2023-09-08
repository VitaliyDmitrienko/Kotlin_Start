fun main(args: Array<String>) {
    val stringOut1 = "Hello World again!"
    val stringOut2: String = "Hello World again! Triple!";
    val numerousInt = 19;
    val numerousLong: Long = 19;
    val numerousFloat: Float = 19F;
    val numerousDouble: Double = 19.0;

    printVoid();
    printString(stringOut1);
    printString(stringOut2);
    printInt(numerousInt);
    printLong(numerousLong);
    printFloat(numerousFloat);
    printDouble(numerousDouble);

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun printVoid () {println("Hello World!")}

fun printString (stringInput: String) {println("String: $stringInput");}
fun printInt (numInput: Int) {println("Int: + $numInput");}

fun printLong(numInput: Long) {println("Long: + $numInput");}
fun printFloat(numInput: Float) {println("Float: + $numInput");}
fun printDouble(numInput: Double) {println("Double + $numInput");}
