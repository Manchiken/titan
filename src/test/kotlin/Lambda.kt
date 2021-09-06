fun main() {
    val a = listOf(1, 2, 3, 4, 5)
    a.forEach { e -> println(e) }
    println(a.map { e -> e * 2 }) //умножает каждый элемент в списке на 2
    println(a.filter { e -> e % 2 == 0 }) //фильтрует по условию
    println(a.reduce { sum, e -> sum + e }) // суммирует

    println(a.sortedByDescending { it }) //сортирует по убыванию
    a.any { it > 10 } //итерируется по всем элементам и находит совпадение хотя бы в одном, если есть возвращает true
    //итератор по какой-либо коллекции всегда будет it
    a.all { it < 10 } // вернет true если все элементы в списке меньше 10

    val numbers: List<Int> = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    println("Положительные $positive\nОтрицательные $negative")

    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
    println(result)
}