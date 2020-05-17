fun main(){
    var name = "Pulkit"
    println(name)

    name = "asada"
    println(name)

    name = ""
    println(name)
    println(name.isEmpty())

    var age = 23
    age = 24
    println(age)

    val a = 34
    println(a)

    //Would not work
    //a = 45

    println(a::class)

    //Number

    val myByte : Byte = 8 //8-bit signed integer
    val myShort : Short = 16 //16-bit signed integer
    val myInt : Int = 32 //32 bit signed integer
    val myLong : Long = 64 //64 bit signed integer

    val myFloat : Float = 32.00F //32 bit floating point number
    val myDouble : Double = 64.00 //64 bit fpn

    val easyToReadLong : Long = 20_000_000_000

    easyToReadLong.plus(1).minus(1).div(45).times(2)
    println(easyToReadLong)


    //String

    var nameFull = "Pulkit"
    println(nameFull.length)
    println(nameFull.decapitalize())
    println(nameFull.capitalize())
    println(nameFull.dropLast(4))

    val myChar : Char = 'a'
    val myCharx : Char = '\t'

    val myString = """
        Yo
        I am cool
        Am I?
    """.trimIndent()
    println(myString)

    println("Hey $nameFull, I hope you are good, also, ${nameFull.toUpperCase()}")

    //Boolean
    var myBool : Boolean = false
    myBool = "".isBlank()

    println(myBool)


    //if, else

    if ("".isBlank()){
        println("Yo blank line")
    } else {
        println("not a blank line")
    }

}