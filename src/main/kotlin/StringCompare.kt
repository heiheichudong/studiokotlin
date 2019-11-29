
fun main(args: Array<String>) {
//    type()
//    stringTrim()
//    stringCompare()
//    stringSplit()
    stringSubstring()
}

/**
 * 字符串类型
 */
fun type() {
    /*---------------------------- 普通字符串 ----------------------------*/
    val place1 = "广东省深圳市宝安区"
    println(place1)
    //换行
    val place2 = "广东省\n深圳市\n宝安区"
    println(place2)
    val place3 = "广东省" +
            "深圳市" +
            "宝安区"
    println(place3)
    //怎样写怎样输出?
    /*---------------------------- 原样输出字符串 ----------------------------*/
    val place4 = """
        广东省
        深圳市
        宝安区
    """.trimIndent()
}

/**
 * 空格问题
 */
fun stringTrim(){
    /*---------------------------- 普通字符串删除空格 ----------------------------*/
    val str = "  张三   "
    val newStr = str.trim()
    println(newStr)
    /*---------------------------- 原样输出字符串 ----------------------------*/
    val str2 = """
        /张三
        /李四
        /王五
    """.trimMargin("/")
    println(str2)

    val s = """
     |   你好
        |的
      |  是啥
     |   阿萨德
    """.trimMargin("|")
    println(s)
}

/**
 * 字符串比较
 */
fun stringCompare(){
    val str1 = "abc"
    val str2 = String(charArrayOf('a','b','c'))
    //equals  比较值  true
    println(str1.equals(str2))
    //== 比较的也是值
    println(str1 == str2)

    //=== 比较地址值 false
    println(str1 === str2)
}

/**
 * 字符串切割
 */
fun stringSplit(){
    val str = "张三.李四-王五"
    //多条件切割
    val result = str.split(".","-")
    println(result)
}
/**
 * 字符串切割
 */
fun stringSubstring(){
    val path = "/Users/yole/kotlin-book/chapter.adoc"
    //获取前6个字符
    println(path.substring(0, 6))
    println(path.substring(0..5))//0到5 区间
    //把第一个r之前的字符截取
    println(path.substringBefore("r"))
    //把最后一个r之前的字符截取
    println(path.substringBeforeLast("r"))
    //把第一个r之后的字符截取
    println(path.substringAfter("r"))
    //把最后一个r之后的字符截取
    println(path.substringAfterLast("r"))
}



