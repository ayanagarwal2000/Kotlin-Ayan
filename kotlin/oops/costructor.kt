fun main(){
    val account=Account(1234,"Ayan",10000f)

    //account.insert(1234,"Ayan",10000f)
    account.deposit(1000f)
    account.withDraw(100f)
    println(account.amount)
    println(account.name)

}

class Account(var acc:Int,var n:String,var amt:Float){
    var accNo:Int =0
    var name:String?=null
    var amount:Float=0f

    //Constructor for the respective Class
    fun Account(acc:Int, n:String, amt:Float){
        this.accNo=acc
        this.name=n
        this.amount=amt
    }

    fun insert(acc:Int, n:String, amt:Float){
        accNo=acc
        name=n
        amount=amt
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