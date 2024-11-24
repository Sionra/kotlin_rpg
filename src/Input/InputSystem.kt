package Input

import java.util.Scanner

object InputSystem {

    fun nameInput(): String {
        var name: String
        do {
            println("Welcome adventurer, what is your name")
            name = Scanner(System.`in`).nextLine()

            println("Your name is : $name")
            println("did this name is good ? ( 0 = no | 1 = yes ) ")
        } while (Scanner(System.`in`).nextInt() != 1)
        return name
    }

    fun home(): Int {
        println("What do you want to do")
        println("1. Fight Monster")
        println("2. Rest at in (put cost here)")
        println("3. Quit ( and lose all progress )")
        do {
            when (Scanner(System.`in`).nextInt()) {
                1 -> return 1
                2 -> return 2
                3 -> return 3
            }
        } while (true)
    }

    fun command(): Int {
        println("1. Attack")
        println("2. Defend")
        println("3. Run")
        do {
            when (Scanner(System.`in`).nextInt()) {
                1 -> return 1
                2 -> return 2
                3 -> return 3
            }
        } while (true)
    }
}
