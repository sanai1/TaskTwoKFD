import logicClasses.*
import java.util.*

class People<in T>(private val item: T) {

    fun printInfo() {
        try {
            (item as Employee).printInfo()
        } catch (e: Exception) {
            println("Error with $item")
        }
    }

    fun work() {
        try {
            (item as Designer).work()
        } catch (e: Exception) {
            try {
                print("level -> ${(item as Programmer).getLevel()}; info: ")
                try {
                    (item as Frontender).work()
                } catch (e: Exception) {
                    try {
                        (item as Backender).work()
                    } catch (e: Exception) {
                        println("It is just a programmer")
                    }
                }
            } catch (e: Exception) {
                try {
                    (item as Employee).printInfo()
                } catch (e: Exception) {
                    println("Error with $this")
                }
            }
        }
    }

}

val employee: Employee = Employee("Employee", 5_500)
val designer: Designer = Designer("Designer", 6_000)
val programmer: Programmer = Programmer("Programmer", 10_000, 18)
val backender: Backender = Backender("Backender", 5_000, 10)
val frontender: Frontender = Frontender("Frontender", 7_500, 13)

fun main() {
    val peopleEmployee: People<Employee> = People(employee)
    val peopleDesigner: People<Designer> = People(designer)
    val peopleProgrammer: People<Programmer> = People(programmer)
    val peopleBackender: People<Backender> = People(backender)
    val peopleFrontender: People<Frontender> = People(frontender)

    peopleEmployee.work()
    println()
    peopleDesigner.work()
    println()
    peopleProgrammer.work()
    println()
    peopleFrontender.work()
    println()
    peopleBackender.work()

    println("------------------------------------------")

    peopleEmployee.printInfo()
    println()
    peopleDesigner.printInfo()
    println()
    peopleProgrammer.printInfo()
    println()
    peopleFrontender.printInfo()
    println()
    peopleBackender.printInfo()

}
