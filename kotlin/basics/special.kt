fun main(){

    var any:Any="Ayan"

    var name:String= any as String
    print(name)
    println("")
    if(any is String){
        var len= name.length
        print(len)

    }
}