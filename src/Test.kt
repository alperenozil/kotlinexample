import java.time.Year

val MY_CONSTANT=100
fun main(args: Array<String>) {
    // val is immutable. same as final in java
    var num: Int
    num=10
    val employee1=Employee("Alperen",500,true)
    val employee2=Employee("Ozil",500,true)
    val employee3=Employee("Alperen",500,false)
    val names = arrayOf("ali","veli","49","50")
    val nums = arrayOf<Long>(3,45,56,1)
    val evenNums = Array(22){e->2*e}// if our array has a pattern, we can write it via lambda expression
    for(name in names) print(name+" ")
    for (num in evenNums) println(num)
    println(employee1.equals(employee2))
    println(employee1==employee3)
    val someobj:Any=employee1
    if(someobj is Employee){
        println("someobj is an object created from Employee")
    }
    //println(employee3.name) -> we can not change the value with this dot
    employee3.setName("newname")
    println("our own setter method is working and employee3 name is " + employee3.getName()) // -> we can define our own getter method
    val change=4.22
    println("value of change is $$change")
    // null pointer exception -> if we say it is nullable and assign a "can't be null" value to it, we get a null pointer exception.

    /*****************************
     *                           *
     *  val str : String? = null *
     *  val str1 = str!!         *
     *                           *
     *****************************/

    println(MY_CONSTANT)
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println("static in kotlin")
    print("before change: ")
    println(CompanyCommunications.reachAsStatic())
    println(CompanyCommunications.changeAsStatic(123))
    print("after change: ")
    println(CompanyCommunications.reachAsStatic())

    val range=1..5
    val charRange='a'..'z'
    for (num in range){
        print(num)
    }
    for (char in charRange){
        print(char)
    }

}

open class Employee (private var name: String, val id: Int, val fullTime: Boolean){
    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            println("name: "+name+" obj.name: "+obj.name)
            println("id: "+id+" obj.id: "+obj.id)
            return name==obj.name && id==obj.id
        }
        return false
    }

    fun setName(newName: String){
        name=newName
    }

    fun getName(): String{
        return name
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id, fulltime=$fullTime)"
    }
}

class OldEmployee(name: String, id: Int, fullTime: Boolean) : Employee(name, id, fullTime)

object CompanyCommunications{ //singleton example
    var currentYear= Year.now().value
    fun getTagLine()="Our company sucks!"
    fun getCopyrightLine()="Copyright. All rights reserved."
    fun reachAsStatic():Int{
        return currentYear;
    }
    fun changeAsStatic(value:Int){
        currentYear=value;
    }
}
