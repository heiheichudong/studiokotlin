package singleton

class Singleton private constructor() {
    //属性是非静态的
    val property = "aaa"
    fun study() {
        println("===开始学习===")
    }

    companion object {
        val instance by lazy { Singleton() }
    }
}