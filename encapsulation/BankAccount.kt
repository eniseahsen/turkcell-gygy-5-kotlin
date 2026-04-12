package encapsulation

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double){
        if(amount > 0){
            balance += amount
        }
    }

    fun withdraw(amount: Double){
        if(amount > 0 && amount <= balance){
            balance -= amount
        }
    }

    fun getBalance(): Double{
        return balance
    }
}