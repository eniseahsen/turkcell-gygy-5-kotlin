//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import encapsulation.BankAccount
import inheritance.Dog
import polymorphism.Circle
import polymorphism.Square
import abstraction.Car
fun main() {
    //Encapsulation
    val account = BankAccount()
    account.deposit(1000.0)
    account.withdraw(250.0)
    println("Balance: ${account.getBalance()}")

    println("-------------------------------")

    //Inheritance
    val dog = Dog()
    dog.eat()
    dog.bark()

    println("--------------------------------")

    //Abstraction
    val car = Car()
    car.move()
    car.stop()

    println("--------------------------------")

    //Polymorphism
    val shapes = listOf(Circle(), Square())
    for (shape in shapes){
        shape.draw()
    }

}