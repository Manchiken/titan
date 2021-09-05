fun main() {
    println(testSimple(2, 8))
    println(testString(5))
    //именнованные аргументы
    testNamedArguments(y = 2, z = 1, x = 5)
    testDefaultArguments(y = 10)
    println(foo(name = "Alice", toUpperCase = true))
//    printEven(1, 2, 4, 5, 6, 7, 8, 9, 10)
    //alternative
    printEven(*intArrayOf(1, 2, 3, 5, 6, 7, 8, 9, 10), 11, 12, 13, 14)
}

fun testSimple(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//аргументы по дефолту
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.toUpperCase() else name) + 42
}

//Vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println("Chetnoe chislo $e") else println("$e Ne chotnoe chislo") }
}