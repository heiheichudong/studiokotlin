package entrust

import kotlin.reflect.KProperty

/**
 * 类委托方式一
 */
class BossOne : EntrustDrive by Driver()

/**
 * 类委托方式二
 */
class Boss(private val entrustDrive: EntrustDrive) : EntrustDrive by entrustDrive {
    override fun drive() {
        println("===给钱===")
        entrustDrive.drive()
        println("===还车===")
    }

    operator fun getValue(driver: Driver, property: KProperty<*>): Int {
        return 5000
    }

    operator fun setValue(driver: Driver, property: KProperty<*>, i: Int) {

    }
}