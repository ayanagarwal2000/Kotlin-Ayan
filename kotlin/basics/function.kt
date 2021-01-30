fun main(){
    println(square(5))
    println(cube(5))
    squarelist(1,2,3,4,5)
}

fun square(num: Int): Int{
    return num*num
}

fun cube(num: Int): Int = square(num)*num

fun squarelist(vararg num:Int){
    
    for(no in num){
        println(no*no)
    }
}