var names= listOf<String>("Hello","World", "this is", "Ayan")
var mutablenames= mutableListOf<String>("Hello","World", "this is", "Ayan")
var arraynames= arrayListOf<String>("Hello","World", "this is", "Ayan")
var mapofnames= mapOf<String,String>("Name" to "Ayan", "Nationality" to "Indian")
var hashmapofnames= hashMapOf<String,String>("Name" to "Ayan", "Nationality" to "Indian")

fun main(){
    println(mapofnames["Name"])
    println(mapofnames["Nationality"])
    hashmapofnames ["Work"]="Student"
    println(hashmapofnames["Work"])
    println("*****************LOOPS******************")

    /*  names.forEach { it String 
        println(it)

    } */

    for(name in mapofnames){
        print(name)

        println(" , ")
    }

    for(x in 0..10){
        print(x)
    }
    println()
    for(x in 0 until 10){
        print(x)
    }
    println()

    for(x in 0 until 10 step 2){
        print(x)
    }
    println()

    for(x in 10 downTo 0 step 2){
        print(x)
    }
    println()
}
