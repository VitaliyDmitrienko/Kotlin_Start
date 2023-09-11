fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val n = numbers[1]  // получаем второй элемент  n=2
    println(numbers[1])
    numbers.forEach { print(it) }; println()
    numbers[2] = 7      // переустанавливаем третий элемент
    println("numbers[2] = ${numbers[2]}") // numbers[2] = 7
    numbers.forEach { print(it) }; println("\n+\n+\t+\t+\n")

    val numbers2 = Array(3, {5}) // [5, 5, 5]
    numbers2.forEach { println(it) }; println()

    val numbers3 = arrayOf(1, 2, 3, 4, 5)
    for(number in numbers3){
        print("$number \t")
    }; println()

    val numbers4 = Array(3, {5}) // [5, 5, 5]
    numbers4.fill(9)
    numbers4.forEach { print(it)}; println()


    val people = arrayOf("Tom", "Sam", "Bob")
    for(person in people){
        print("$person \t")
    }
    people[2] = "James"
    println(people[2])

    val people2 = listOf<String>("Jack", "John", "James", "Jaimie", "Javier")
    var people3 = listOf<String>()
//    people2 = listOf("Tom", "Sam", "Bob")
//    people2.set(5, "Dick")
    people2.forEach { println(it) }
//    people2[1]="JaJA"
    people3 = mutableListOf("Tom", "Sam", "Bob")
    for (pep in people3) print(pep); println()
    people3[2]="Dick"
    for (pep in people3) print(pep); println()
    println("people2 actual size is: ${people2.count()}")
    println("people3 actual size is: ${people3.size}")
    people3.add(2,"Doc")
    people3.add(2, "")
    for (pep in people3) print(pep); println()
    println("people3 actual size is: ${people3.count()}")
    println("people3 actual size is: ${people3.size}")

    val table = Array(3, { Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)     // первая строка таблицы
    table[1] = arrayOf(4, 5, 6)     // вторая строка таблицы
    table[2] = arrayOf(7, 8, 9)     // третья строка таблицы

    for(row in table){
        for(cell in row){
            print("$cell \t")
        }
        println()
    }
    val cats = arrayListOf<String>()
    cats.add("Мурзик")
    cats.add("Васька")
    cats.add("Барсик")
    for(cat in cats){
        println("Кот $cat")
    }
}