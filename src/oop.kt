import java.security.spec.NamedParameterSpec

fun main() {
    var gari = Car ("Toyota","Prado","KC1232F",90) // object ...instance of a class
    gari.start()
    gari.accelerate(9)
    println(gari.speed )
    var benz=Car("Mercedes Benz","E250","KD324J",56)
    benz.start()
    println(benz.speed )
    benz.accelerate(900)
    println(benz .speed )
    println(benz.registration )
    benz.carName()
    gari.carName()
    benz.carSound()
    var biroPen =BiroPen()
    biroPen .write("It writes in black")
    var details = Registration("Hope",12,"Uganda","Primary")
    details .name
    println(details.age )
    println(details.toString() )
   // var age :Int = readLine()!!.toInt()
   // var ageNextYear= age+1
   // println("You will be $ageNextYear years old next year")
    gari.deccelerate(7)
    benz.deccelerate(10)
    println(gari.speed)
    println(benz.speed)
 }
class Car(var make:String, var model :String,var registration:String ,var speed:Int){ // behavior //var model -state
fun start (){
    println("I am starting ")
 }
 fun accelerate(acceleration:Int ):Int {
     speed=speed+acceleration
     return speed
 }
    fun carName(){
        println(make)
        println(model )
        println("$make $model") // interpolate to print on same line
    }
    fun carSound(){
        println("beep beep")
    }
    fun deccelerate(deccelaration :Int):Int{
        speed=speed-deccelaration
        return speed
    }
//
//
// , hoot() and stop()
    }

//class without parameters
class BiroPen(){
    fun write(writing:String){ //writing is a variable
        println(writing)
    }
}
data class Registration( val name:String,var age:Int ,var location:String,var educationLevel:String){ // data class has inbuilt dataType

}