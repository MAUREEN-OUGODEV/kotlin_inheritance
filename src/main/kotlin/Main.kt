

fun main() {

    var toyota =Car("Nissan","Vitz","Black",6)

    toyota.carry(4)
    toyota.identity()
    println(toyota.calculateParkingFees(4))
    var bus =Bus("Nissan","Scania","blue",47)
println(bus.maxTripFare(arrayOf(100.0,300.0,400.0,600.0)))
    println(bus.calculateParkingFees(3))

}
 open class Vehicle(var make: String,var model: String, var color: String, var capacity: Int){
     open fun carry(people:Int){
         println("$people")
     }
     fun identity(){
         println("i am a $color $make $model")
     }
      open fun calculateParkingFees(hours: Int) :Int{
         var parkingFee=hours*20
         return parkingFee
     }




}

class Car(make: String,model: String,color: String,capacity: Int): Vehicle(make,model,color,capacity){
     override fun carry(people: Int){
         var x = people - capacity
        if(capacity >= people){
            println ("Carrying $people passenger")
        }
        else{

            println("over capacity by $x  people ")
        }





    }
      override fun calculateParkingFees(hours: Int) :Int{
        var parkingFee=hours*20
        return parkingFee
    }

}
class Bus(make: String,model: String,color: String,capacity: Int): Vehicle(make,model,color,capacity) {

    fun maxTripFare(fare:Array < Double >): Double{
//
        var maxFareTrip = fare.max()
        return maxFareTrip
    }

    override fun calculateParkingFees(hours: Int): Int {
        var productOfHours = hours * capacity
        return productOfHours

    }
}