fun main (){
   var b = two("Blaire",23)
    println(b)
    one()
    three()
    four()


}

fun one (){
    var name = "akirachix"
    println(name[0])
    println(name[4])
    println(name[5])

}

fun two (name:String,age:Int):String{

    var sentence = "Hi,my name is $name and I am $age years old"

    return sentence

}

fun three () {
    var justme = "I can! I will! I must"
  println("The length of this string is:" + justme.length)

}


fun four () {
    val name = "Suzzie"
    if (name == "Suzzie") {
        println("That's me!")
    } else {
        println("I don't know who that is")
    }

}