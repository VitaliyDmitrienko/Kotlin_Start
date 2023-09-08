fun main(args: Array<String>) {
    val stringOut1 = "Hello World again!";
    val stringOut2: String = "Hello World again! Triple!";
    val numerousInt = 19;
    val numerousLong: Long = 19;
    val numerousFloat = 19;

    second();
    third(stringOut1);
    third(stringOut2);
    fourth(numerousInt);

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun second () {println("Hello World!")}

fun third (stringInput: String) {println(stringInput);}
fun fourth (numInput: Int) {println(numInput);

}