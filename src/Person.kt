class Person(var name: String = "default"){
    fun copy(): Person{
        return Person(name)
    }

    fun myGetName(): String{
        return name
    }

    fun myGetNameLen(): Int{
        return name.length
    }
}