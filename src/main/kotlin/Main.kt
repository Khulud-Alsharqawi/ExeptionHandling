//Exception Handling -> is any error occur in running time So we nead to handl it

class ExceptionsHandling (messaga:String):Exception(messaga)

fun vote(name:String,age:Int){
    if (age<18)
        throw ExceptionsHandling("younger than 18 can not vote")
    println("$name voted")
}


fun main (){
    try {
        vote("khulud",17)
    }catch (e:ExceptionsHandling){
        e.printStackTrace()
    }finally { println("final Block")}
}

