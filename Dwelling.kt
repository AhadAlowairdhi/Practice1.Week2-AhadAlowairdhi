/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
import kotlin.math.PI

fun main() {
    // create object
    val squareCabin = SquareCabin(10,50.0)
    
    with(squareCabin){
        	println("\nSquare Cabin\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")  
            println("Floor Area: ${floorArea()}")
    		println("Has Room?? ${hasRoom()}")
            getRoom()
    }
    // create object  from RoundHut
    val roundHut = RoundHut(1,10.0)
    
    with(roundHut){
        	println("\nRound Hut\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")
            println("Floor Area: ${floorArea()}")
    		println("Has Room?? ${hasRoom()}")
            getRoom()
    }
    
    // create object  from RoundHut
    val roundTower = RoundTower(50,15.0,10)
    
    with(roundTower){
        	println("\nRound Tower\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")
            println("Floor Area: ${floorArea()}")
    		println("Has Room?? ${hasRoom()}")
            getRoom()
    }
}

// Base Class - Parent Class - Super Class 
abstract class Dwelling(private var residents : Int){ // Building class
    
    //Attributes
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    // Fuctions - Methods
    fun hasRoom() : Boolean{
        return residents <= capacity
    }
    
    fun getRoom() {
        if(residents <= capacity){
            residents++
            println("You got a room")
        }else{
            println("Sorry, at capacity and no rooms left.")
        }
    }
    
    abstract fun floorArea() : Double
    
} // End Dwelling Class

// SubClasses
class SquareCabin(residents : Int, val length : Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea() : Double {
        return length * length
    }
}

open class RoundHut(residents : Int, val radius : Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 3
    
    
    override fun floorArea() : Double {
        return PI * radius * radius
    }
}

class RoundTower(residents : Int, radius : Double, val floors : Int = 2) : RoundHut(residents, radius){
    override val buildingMaterial = "Stone"
    override val capacity = 4
    
    override fun floorArea() : Double{
        return super.floorArea() * floors
    }
}
