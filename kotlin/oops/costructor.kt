fun main(){
    val account=Account(1234,"Ayan",10000f)
​
    //account.insert(1234,"ayan",10000f)
    account.deposit(1000f)
    account.withDraw(100f)
    println(account.amount)
    println(account.name)
​
}
​
class Account(accNo:Int, name:String, amount:Float){
    var accNo:Int 
    var name:String
    var amount:Float
​
    //Constructor for the respective Class
    init{
        this.accNo=accNo
        this.name=name.capitalize()
        this.amount=amount
    }
​
    fun deposit(money:Float){
        amount += money
        println(amount)
    }
​
    fun withDraw(money:Float){
        if (amount<money){
            println("Not Sufficient Funds")
        }
        else{
            amount -= money
            println(amount)
        }
    }
}