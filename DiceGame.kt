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


        //Display the results before rolling the dice
        println("The current side up for ${d6.name} is ${d6.currentSideUp}")
        println("The current side up for ${d20.name} is ${d20.currentSideUp}")
        println("The current side up for ${d10.name} is ${d10.currentSideUp}\n")


        println("Testing the roll method\n")
        
        //Display the results after rolling the dice
        println("Rolling the d6...")
        d6.roll()
        println("The new value is ${d6.currentSideUp}")

        println("Rolling the d20...")
        d20.roll()
        println("The new value is ${d20.currentSideUp}")

        println("Rolling the Percentile...")
        d10.roll()
        println("The new value is ${d10.currentSideUp}\n")


        //Set a Die object to show its highest value
        println("Setting the d20 to show its highest value 20...")
        //Number of sides of the die is the highest value
        d20.currentSideUp = d20.numberOfSides
        println("The side up is now ${d20.currentSideUp}.\n")


        //Create 5 six-sided dice
        println("Creating 5 d6...")
        val dice = Array(5) { Die(6) }

        var numberOfRolls = 0
        //Roll each Die in a loop until getting 5 of a kind
        do {
            for (i in 0 until 5) {
            dice[i].roll()
            }
            //Incrementing the number until all elements have the same value to exit the loop
            numberOfRolls++
        } while (!dice.all { it.currentSideUp == dice[0].currentSideUp })
        
        //Count and display the number of rolls
        println("YAHTZEE! It took $numberOfRolls rolls")

    }

}

//Start the game
fun main(){
    DiceGame().run()
}

