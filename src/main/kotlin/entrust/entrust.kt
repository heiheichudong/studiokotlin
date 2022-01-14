import entrust.Boss
import entrust.BossOne
import entrust.DaiJia
import entrust.Driver

fun main(args: Array<String>) {
    println("sssssssssss")
    //方式一
    val bossOne = BossOne()
    bossOne.drive()
    //方式二
    val driver = Driver()

    val boss1 = Boss(driver)
    boss1.drive()
    val dj = DaiJia()
    val boss2 = Boss(dj)
    boss2.drive()
}



