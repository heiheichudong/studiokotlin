fun main() {
    println("hello world")
    println(sum(1, 2 + 4))
    var a = 1
    println(a.toByte())
}

fun sum(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    main()
    val s = """
     |   你好
        |的
      |  是啥
     |   阿萨德
    """.trimMargin("|")
    println(s)
    testFor("123456")

}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun testFor(string: String){
    for ((index,s) in string.withIndex())
    println("index = $index s= $s")
    string.forEachIndexed { index, c -> println("index = $index s= $c") }
    val range = 1..100
    range.reversed()//翻转
    for (i in range step 3) {
        println("index = $i s= $i")
    }
    val strs = arrayOf("zs","ls")
    strs.indexOfFirst { it.startsWith("z") }
}