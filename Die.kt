//Yuen Shan Tsang (A00270323)
//JAV-1001 - 11354 - App Development for Android - 202301 - 001
//Lab 3 - Classes/Objects

//This is a class that closely replicates dice.

import kotlin.random.Random

class Die {
    //Properties to describe the die
    val name: String
    val numberOfSides: Int
    var currentSideUp: Int = 1

    //0 argument constructor
    constructor() {
        name = "d6"
        numberOfSides = 6
        roll()
    }

    //1 argument constructor
    constructor(numberOfSides: Int) {
        this.numberOfSides = numberOfSides
        this.name = "d$numberOfSides"
        roll()
    }    

    //2 argument constructor
    constructor(numberOfSides: Int, name: String) {
        this.numberOfSides = numberOfSides
        this.name = name
        roll()
    }

    //Roll method
    fun roll() {
        currentSideUp = Random.nextInt(1, numberOfSides + 1)
    }

}
