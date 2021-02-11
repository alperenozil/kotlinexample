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
    println(employee3)
    val change=4.22
    println("value of change is $$change")
    // null pointer exception -> if we say it is nullable and assign a "can't be null" value to it, we get a null pointer exception.

    /*****************************
     *                           *
     *  val str : String? = null *
     *  val str1 = str!!         *
     *                           *
     *****************************/
}

class Employee (val name: String, val id: Int, val fullTime: Boolean){
    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            println("name: "+name+" obj.name: "+obj.name)
            println("id: "+id+" obj.id: "+obj.id)
            return name==obj.name && id==obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id, fulltime=$fullTime)"
    }
}