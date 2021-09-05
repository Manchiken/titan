fun main() {
    var a: String = "Hello world"
    // a = null NPE исключен
    var b: String? = "TEst"
    b = null
    //безопасный вызов с null-ом
    //вернет длинну b, если null -> null
    b?.length
    //bob?.department?.head?.name


    //Elvis - оператор ?:
    //как было раньше
    //if (b == null)
    val l = b?.length ?: -1 //(если не пришла длинна а пришел null, то вернется значение -1)

    b = if ((0..10).random() > 5) "fgsddg" else null
    // !! - оператор, который выбрасывается NPE если в переменной находится null
    val t = b!!.length
}