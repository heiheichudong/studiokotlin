package entrust

class Driver : EntrustDrive {

    var salary:Int by Boss(this)

    override fun drive() {
        println("====司机开车==== $salary")
    }
}