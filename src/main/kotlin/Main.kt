fun main(args: Array<String>) {
    var final = addSomething(1, 5, 10)
    println(final)


    //inline function declaration
    var square = {num: Int -> num * num}

    //inline function use
    var xsq = square(3)
    println(xsq)


    val calcGrade = {
        grade: Int ->
        when(grade){

            in 1..60 -> "Fail"
            in 61..100 -> "Pass"
            else -> "ukn"
        }
    }


    println(calcGrade(25))

    var array = arrayOf(1,2,3,4,5)

    //Javascript style Code Simplification
    array.forEach {item -> println(item)}

    array.forEach { println(it)}




}



fun addSomething(num1: Int, num2: Int):Int{

    val ans = num1 + num2
    return ans
}


//Kotlin's syntax allows for verticle organized parameters (Swift might as well)
fun addSomething(
    num1: Int = 0,
    num2: Int = 3,
    num3:Int = 0
): Int{


    return num1 + num2 + num3
}

