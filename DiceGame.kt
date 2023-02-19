//A runner class to test Die class

class DiceGame {
    fun run() {
        //Create different sized dice using each constructor
        println("Creating a default d6...")
        val d6 = Die()
        println("Creating a d20...")
        val d20 = Die(20)
        println("Creating percentile die (a special d10)...")
        val d10 = Die(10, "Percentile")

        //Roll the dice and display their results (before and after)
        println("The current side up for ${d6.name} is ${d6.currentSideUp}")
        println("The current side up for ${d20.name} is ${d20.currentSideUp}")
        println("The current side up for ${d10.name} is ${d10.currentSideUp}\n")

        println("Testing the roll method\n")

        println("Rolling the d6...")
        d6.roll()
        println("The new value is ${d6.currentSideUp}")

        println("Rolling the d20...")
        d20.roll()

        println("The new value is ${d20.currentSideUp}")

        println("Rolling the Percentile...")
        d10.roll()
        println("The new value is ${d10.currentSideUp}\n")

        //one Die object and set it to show it's highest value
        println("Setting the d20 to show 20...")
        d20.currentSideUp = d20.numberOfSides
        println("The side up is now ${d20.currentSideUp}.\n")

        //Create 5 six-sided dice. Roll each Die in a loop until you get 5 of a kind. Count and display the number of rolls.
        println("Creating 5 d6...")
        
        var numberOfRolls = 0

        val dice = Array(5) { Die(6) }

        do {
            for (i in 0 until 5) {
            dice[i].roll()
            }
            numberOfRolls++
        } while (!dice.all { it.currentSideUp == dice[0].currentSideUp })

        println("YAHTZEE! It took $numberOfRolls rolls")

    }

}

fun main(){
    DiceGame().run()
}

