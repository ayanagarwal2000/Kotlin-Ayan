fun main(){
    println(square(5))
    println(cube(5))
}

fun square(num: Int): Int{
    return num*num
}

fun cube(num: Int): Int = square(num)*num