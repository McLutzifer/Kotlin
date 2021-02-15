fun main(args: Array<String>) {
    println("Hello World!")

    var num0: Int = 42
    println(num0)

    println("What's your name?")
    val name = readLine()
    println("Hello $name")

    var x: Int = 90
    println(x)

    x = 89
    println(x)

    var num1 = 9
    var num2 = 4

    println(num1/num2)

    var num = 4
    num *= 5
    println(num)
    num++
    println(num)

    println("Insert a and b")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println(a+b)

    //conditional expressions
    val number = -7
    val result= if (number > 0) "Positive"
                else "Negative"
    println(result)

    val res = when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
    println(res)
}