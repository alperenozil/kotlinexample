fun main(args: Array<String>) {
    // val is immutable. same as final in java
    var num: Int
    num=10
    num=20
    val employee1=Employee("Alperen",500)
    employee1.name="ali"
    val names = arrayListOf("ali","veli","49","50")
    for(name in names) print(name+" ")
}

class Employee(var name: String, val id: Int){
    override fun equals(obj: Any?): Boolean {
        if(obj is Employee){
            return name==obj.name && id==obj.id
        } else return false
    }
}