fun main(){
    Thread{printList("1")}.start()
    Thread{printList("2")}.start()
    Thread{printList("3")}.start()
}

fun printList(){
    for(i in 0 until 1000){
        println(" $id  $i " )
    }
}