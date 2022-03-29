fun main(){
    var nakayiza = Human("Getrude",25,67)
    println(nakayiza.name)
    nakayiza.eat(7)
    println(nakayiza.weight)
    nakayiza.add(1)
    println(nakayiza.age)
    var julliet = User("Nakayiza","Julliet","jullietnakayizaa@gmail.com","+256777896576","julierealmids")
    println(julliet.user())
    println(julliet.lastname)
    println(julliet.email)

}
class Human(var name:String,var age:Int,var weight:Int,){
    fun eat(foodweight:Int){
        var weight = 7
        weight+=foodweight
        println("I am eating 7kgs of food")
    }

    fun speak(speech:String){ speech

    fun speak(speech:Int){ Seek

        println("The purpose for this event is to empower women in the tech industry")
    }
    fun birthday(){
    }
    fun add(addition:Int):Int{
        age+=1
        return age
    }
}
data class User(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String){
    fun user(){
        println("Student")
    }
}