package logicClasses

import kotlin.random.Random
import kotlin.time.times

class Designer(
    name: String,
    salary: Int) : Employee(name, salary) {

    override fun work() {
        val delta = Random.nextInt() % 1000 * if (Random.nextBoolean()) 1 else -1
        println("designer ${getName()} was working and his(her) salary changed to $delta")
        updateSalary(delta)
    }

}