package logicClasses

import kotlin.random.Random

class Backender(
    name: String,
    salary: Int,
    level: Int) : Programmer(name, salary, level) {

    override fun work() {
        val delta = (Random.nextInt() % 100) * (Random.nextInt() % 50) * if (Random.nextInt().takeIf { it % 3 != 0 } != null) 1 else -1
        println("backender ${getName()} was working and his(her) salary changed to $delta")
        updateSalary(delta)
    }

}