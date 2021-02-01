fun main(){
    val account=Account(1234)

    
    account.deposit(1000f)
    account.withDraw(100f)
    println(account.amount)
    println(account.name)

}

class Account{
    var accNo:Int =0
    var name:String?=null
    var amount:Float=0f

    //Constructor for the respective Class
    constructor(acc:Int, n:String, amt:Float){
        this.accNo=acc
        this.name=n
        this.amount=amt
    }

    constructor(acc:Int, n:String){
        this.accNo=acc
        this.name=n
        this.amount=0f
    }

    constructor(acc:Int){
        this.accNo=acc
        this.name="Default"
        this.amount=0f
    }


    fun deposit(money:Float){
        amount += money
        println(amount)
    }

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