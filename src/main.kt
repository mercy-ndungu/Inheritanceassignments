fun main(){
    var subaru=Cars(make = "Range Rover", model = "Evoque", colour = "grey", capacity = 6)
    subaru.carry(10)
    subaru.carry(15)
    subaru.identity()
    println(subaru.calculateParkingFees(3))

    var y=Bus("Jeep","wrangler","burgundy",72)
    println(y.maxTripFare(100.0))
    println(y.calculateParkingFees(3))



}
open class Cars(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry (people:Int){
        var population=people - capacity
        if (people<=capacity){
            println("carrying $people passengers")
        }
        else{
            println("overcapacity by $population people")
        }
    }
    fun identity(){
        println("I am a $colour $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var fee=hours*20
        return fee
    }

}
class Bus(make: String,model: String,colour: String,capacity:Int):Cars(make,model,colour,capacity){
    fun maxTripFare(fare:Double):Double{
        var trips = (fare * capacity)
        return trips
    }

    override fun calculateParkingFees(hours: Int): Int {
        var x=hours*capacity
        return x

    }
}