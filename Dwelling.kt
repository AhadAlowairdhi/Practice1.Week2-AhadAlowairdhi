fun main() {
    // create object
    val squareCabin = SquareCabin(10)
    
    with(squareCabin){
        	println("\nSquare Cabin\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasRoom()}")
    }
    // create object  from RoundHut
    val roundHut = RoundHut(1)
    
    with(roundHut){
        	println("\nRound Hut\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasRoom()}")
    }
    
    // create object  from RoundHut
    val roundTower = RoundTower(1)
    
    with(roundTower){
        	println("\nRound Tower\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasRoom()}")
    }
}

// Base Class - Parent Class - Super Class 
abstract class Dwelling(private val residents : Int){ // Building class
    
    //Attributes
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    // Fuctions - Methods
    fun hasRoom() : Boolean{
        return residents <= capacity
    }
} // End Dwelling Class

// SubClasses
class SquareCabin(resident : Int ) : Dwelling(resident){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}
open class RoundHut(residents : Int) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 3
}
class RoundTower(residents : Int) : RoundHut(residents){
    override val buildingMaterial = "Stone"
    override val capacity = 4
}
