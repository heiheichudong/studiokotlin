package singleton

fun main(args: Array<String>) {
    Singleton.instance.study()
    SingleObject.study()
    println(SingleObject.property)
    COLOR.RDE.r
}

enum class COLOR(val r:Int,val g:Int,val b:Int){
    RDE(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255)
}

sealed class Language(){
    class Java()
    class C()
    class PHP
}