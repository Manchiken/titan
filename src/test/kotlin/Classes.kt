fun main() {
    val child = Person("Leha", "Ivanov", 13)
    val p1 = Person(firstName = "Ivan", lastName = "Ivanov", age = 30, child)
    print(p1.children.get(0).firstName)
    val p2 = Person()
    println(p2.age)

    val rectagle1: Rectagle = Rectagle(5.0, 10.0)
    println("Perimeter is ${rectagle1.perimeter}")
    val rectagle2: Rectagle = Rectagle(5.0, 10.0)
    println(rectagle1 == rectagle2) // так как класс data, у него есть методы hashCode и equals поэтому обьекты можно сравнить
}

//Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf()

    //блок в котором выполняется код первичного конструктора
    init {
        println("Person is created $firstName")
    }

    //вторичный конструктор (обязательно вызывает первичный конструктор)
    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    //конструктор без аргументов
    constructor() : this("", "", -1)
}

data class Rectagle(var hight: Double, var lenght: Double) {
    var perimeter = (hight + lenght) * 2

    var test: Int = 1
        get() = field + 1 //'filed' == this в java
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area(): Double = hight * lenght
}
