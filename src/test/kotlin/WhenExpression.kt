fun main() {
    testWhen(1)
    testWhen(2)
    testWhen("string")
    testWhen(15)
    testWhen(150)
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        "string" -> println("Строка")
        in 10..20 -> println("От 10 до 20")
        is String -> println("Тип String")
        else -> println("Что-то еще")
    }
}