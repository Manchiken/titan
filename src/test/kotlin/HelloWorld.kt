fun main() {

//    val test1: String = "Hello"
//    var test2: String = "World"
//    test2 = "Goodbye"
//    println("Value of test2 $test2")
//    println("Sum is ${2 + 2}")


    val items = listOf("cherry", "banana", "orange")
    //    forEach
//    for (item in items){
//        println(item)
//    }

    //while
//    var index  = 0
//    while (index<items.size){
//        println(items[index])
//        index++
//    }

    //Диапазоны (как в Python)
    println(5 in 3..10)

//    for (i in 1..10) {
//        println("number $i")
//    }

    //исключая последний элмеент
//    for (i in 1 until 10) {
//        println("number $i")
//    }


    //в обратном порядке
//    for (i in 10 downTo 1)
//        println(i)

    //с шагом 5
    for (i in 0..30 step 5) {
        println(i)
    }
}


