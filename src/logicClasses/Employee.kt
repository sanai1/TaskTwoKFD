package logicClasses

open class Employee(
    private val name: String,
    private var salary: Int,
    private var capital: Int = 0) {

    fun printInfo() {
        println("name employee -> $name\nsalary employee -> $salary\ncapital employee -> $capital")
    }

    fun paySalary() {
        this.capital += this.salary
    }

    fun updateSalary(delta: Int) {
        this.salary += delta
    }

    open fun work() {}

    protected fun getName() : String {
        return this.name
    }

    protected fun getSalary() : Int {
        return this.salary
    }

}