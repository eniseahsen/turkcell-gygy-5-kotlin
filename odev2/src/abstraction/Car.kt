package abstraction

class Car: Vehicle() {
    override fun move(){
        println("Car is moving")
    }
}