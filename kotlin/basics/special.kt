fun main(){

    var any:Any="Ayan"

    var name:String= any as String
    print(name)
    println("")
    if(any is String){
        var len= name.length
        print(len)

    }

    when (any){
        "Agarwal" -> {
            println("Name1")
             }
        
        "Ayan" -> {
            println("Name2")
             }     
        else ->{
            println("NONE")
        }       
    }

    val x= when(any){
        "Agarwal" ->"$any Agarwal"
        "Ayan" -> "$any is name"
        else -> "Doesn't satisfy"
    }
    println(x)
}