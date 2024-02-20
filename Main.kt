fun main(args: Array<String>) {
var x = greeting("Mikisa")
    println(x)
    var y = divide(93,32.0)
    println(y)
    var m = sum(12, 34, 56, 34)
    println(m)
    var d = text("I am Mikisa Priscilla and I like putting myself up to test")
    println(d)
}
fun greeting(name: String): String{
    var greetPerson = "Hello"+" "+name
    return greetPerson

}
fun divide(num1: Int, num2: Double): Double{
    var division = num1 % num2
    return division
}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var result = num1+num2+num3+num4
    return result
}
fun text(words: String): String{
    var setence = words
    return setence
}

