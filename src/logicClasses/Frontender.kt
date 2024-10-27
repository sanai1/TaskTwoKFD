package logicClasses

import kotlin.random.Random

class Frontender(
    name: String,
    salary: Int,
    level: Int) : Programmer(name, salary, level) {

    override fun work() {
        val delta = (Random.nextInt() % 1000) * getLevel() * if (Random.nextInt().takeIf { it % 4 != 0 } != null) 1 else -1
        println("frontender ${getName()} was working and his(her) salary changed to $delta")
        updateSalary(delta)
    }

}