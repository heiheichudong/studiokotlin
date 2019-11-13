fun main() {
    println("hello world")
    println(sum(1, 2 + 4))
    val ssum = ::sum
    println(ssum(1,2))
    println(ssum?.invoke(2, 3))
    val summ:(Int,Int) ->Int = {a,b -> a+b}
    println(summ(3, 4))
    println(summ?.invoke(4, 5))
}

fun sum(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    main()
}