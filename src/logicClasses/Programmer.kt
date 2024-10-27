package logicClasses

open class Programmer(
    name: String,
    salary: Int,
    private var level: Int) : Employee(name, salary) {

    fun getLevel() : Int {
        return this.level
    }

    fun setLevel(level: Int) {
        this.level = level
    }
}