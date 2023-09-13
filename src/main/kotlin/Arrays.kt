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

    val people2 = listOf("Jack", "John", "James", "Jaimie", "Javier")
    var people3: List<String>
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

    val numbers5 : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    for (n in numbers5){ print(n) };println()
    numbers5.add(4)
    for (n in numbers5){ print(n) }; println()
    numbers5.clear()
    for (n in numbers5){ println(n) }; println()

    val numbers6: MutableList<Int> = mutableListOf(5, 6, 7)
    numbers6.add(12)
    numbers6.add(0, 23)
    numbers6.addAll(0, listOf(-3, -2, -1))
    numbers6.removeAt(0)
    numbers6.remove(5)
    for (n in numbers6){ print("$n, ") }; println()

    val people4 = setOf("Tom", "Sam", "Bob")
    for(person in people4) print("$person, "); println()
//    people4.forEach(it.uppercase())
//    for(person in people4) {person = person.uppercase()}
    println(people4) // [Tom, Sam, Bob]

    val numbers7: HashSet<Int> = hashSetOf(5, 6, 7)
    val numbers8: LinkedHashSet<Int> = linkedSetOf(25, 26, 27)
    val numbers9: MutableSet<Int> = mutableSetOf(35, 36, 37)
    println(numbers9.add(2))
    println(numbers9.addAll(setOf(4, 5, 6)))
    println(numbers9.remove(36))

    for (num in numbers9) print("$num, "); println()    // 35 37 2 4 5 6

    val people5 = mapOf(1 to "Tom", 5 to "Sam", 8 to "Bob")
    for(person in people5){
        println("${person.key} - ${person.value}")
    }
    println(people5)     // {1=Tom, 5=Sam, 8=Bob}

    val dictionary = mapOf("red" to "красный", "blue" to "синий", "green" to "зеленый")
    var blue = dictionary.get("blue")
    println(blue)   // синий
    blue = dictionary["blue"]
    println(blue)   // синий

    val yellow = dictionary.get("yellow")
// либо так
// val yellow = dictionary["yellow"]
    println(yellow)   // null

    val dictionary2 = mapOf("red" to "красный", "blue" to "синий", "green" to "зеленый")
    val yellow2 = dictionary2.getOrDefault("yellow", "Undefined")
    println(yellow2)   // Undefined
    val blue2 = dictionary2.getOrDefault("blue", "Undefined")
    println(blue2)   // синий
    val yellow3 = dictionary2.getOrElse("yellow"){"Not found"}
    println(yellow3)   // Not found
    val blue3 = dictionary2.getOrElse("blue"){"Not found"}
    println(blue3.uppercase())   // синий

    var dictionary3 = mutableMapOf("red" to "красный", "blue" to "синий", "green" to "зеленый")
    for (str in dictionary3)
        dictionary3[str.key] = str.key.uppercase()
    for (str in dictionary3) println(str.key)
    for (str in dictionary3) println(str.key.uppercase())

}