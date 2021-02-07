fun main(args: Array<String>) {
    // val is immutable. same as final in java
    var num: Int
    num=10
    num=20
    val employee1=Employee("Alperen",500)
    val employee2=Employee("Ozil",500)
    val employee3=Employee("Alperen",500)
    val names = arrayListOf("ali","veli","49","50")
    //for(name in names) print(name+" ")
    println(employee1.equals(employee2))
    println(employee1==employee3)
}

class Employee(var name: String, val id: Int){
    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            println("name: "+name+" obj.name: "+obj.name)
            println("id: "+id+" obj.id: "+obj.id)
            return name==obj.name && id==obj.id
        }
        return false
    }
}