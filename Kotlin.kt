// fun main(args: Array<String>) {
//     var x = 5
//     var y = 10
//     val rightshift = x shr 1
//     val leftshift = x shl 1
//     println("Right Shift: $rightshift")
//     println("Left Shift: $leftshift")
    
//   	println(+x)
//     println(-x)
//     println(x++)
//     println(y--)
    
//     println()
//     println()
//     println()
//     println()

// var str: String? = null
//     var str2: String? = "May be declare nullable string"
//     var len1: Int = str ?.length ?: -1
//     var len2: Int = str2 ?.length ?: -1
//     println("Length os str is ${len1}")
//     println("Length os str2 is ${len2}")
    
//     println("-----------Usage of When-----------")
//     var choice = 1
//     val result = when (choice){
//         1 -> "Ram Ram"
//         2 -> "Hi"
//         3 -> "Namaste"
//         4 -> "Hello"
//         5 -> "Vanakkam"
//         else -> "No Need"
//     }
//     println(result)
    
//     println("------------For----------------")
//     for(i in 1..5)
//     {
//         println(i)
//     }
    
//     println("-----------Usage of FOR------------")
//     for(item in 5 downTo 1 step 2){
//         println(item)
//     }
    
//     println("--------------While and Do-While-------------------")
//     var n=5
//     while(n<10)
//     {
//         println("-------------$n--------------")
//         n++
//     }
//     do{
//         println("------------+$n+-------------")
//         n++
//     }while(n<10)
    
// }

fun main(args:Array<String>)
{
//     fun abc(): Int{
//     var a= 5
//     var b = 10
//     val c = a+b
// //     println(a+b)
//     return c}
//     val d = abc()
//     println(d)
    
//     fun sum1(num1: Int, num2: Int): Int{
//         val add = num1+num2
//         return add
//     }
    
    var count = 0
    fun rec(){
        count++;
        if(count<=5){
            println("Hello"+ count);
            rec();
        }
        val a = rec()
        println(a)
    }
}

// Find out the factorial of n numbers using recursion 
// Find Sum of n numbers using recursion
// Find sum of even numbrs for the given range of 1 to n using recursion and function calling
// Make a class and create two objects of the class with two different parameters

class Car{
    var make: String = ""
    var model: String = ""
    var year: Int = 0
    
    fun getInfo(): String{
        return "$make $model, year $year"
    }
}

}