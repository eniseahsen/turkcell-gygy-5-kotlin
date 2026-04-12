package abstraction

abstract class Vehicle {
    abstract fun move()

    fun stop(){
        println("Vehicle stopped")
    }
}