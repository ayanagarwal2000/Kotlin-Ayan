fun main(){
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