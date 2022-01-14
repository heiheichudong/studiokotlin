package extend

fun main(args: Array<String>) {
    val father = Father()
    father.say()
    //子类也可调用父类的拓展函数
    val son = Son()
    son.say()
}

fun Father.say(){
    println("say hh")
}