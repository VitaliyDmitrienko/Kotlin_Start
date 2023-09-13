fun main() {
    val tom = Person("Tom")
    val bob = Person("Bob")
    val alice = Person("Alice")

    println(tom.name)   // Tom
    println(bob.name)   // Bob
    println(alice.name) // Alice
}

class Person(_name: String){
    val name: String
    init{
        name = _name
    }
}