fun main(){
    Thread{printList("1")}.start()
    Thread{printList("2")}.start()
    Thread{printList("3")}.start()
}

fun printList(id:String){
    for(i in 0 until 1000){

        if(id=="2" && i==500){
            Thread.sleep(100)
        }


        println(" $id  $i " )
    }
}