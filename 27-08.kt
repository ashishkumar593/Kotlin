// 1. find factorial of n numbers using recursion
fun main(args:Array<String>) {
    
    fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}
    val num1 = 5 
    println("Factorial of $num1 is ${factorial(num1)}")



// 2. find sum of n numbers using recursion

fun sum(n: Int): Int {
  
    if (n <= 0) {
        return 0
    }
    return n + sum(n - 1)
}

    val num2 = 5 
    println("Sum of numbers from 1 to $num2 is ${sum(num2)}")



// 3. find sum of even numbers for the given range of 1 to n using recursion and function calling

fun sum1(n: Int): Int {
    fun sumEven(current: Int): Int {
      
        if (current < 1) {
            return 0
        }
       
        return if (current % 2 == 0) {
            current + sumEven(current - 1)
        } else {
            sumEven(current - 1)
        }
    }
    return sumEven(n)
}


    val num3 = 10 
    println("Sum of even numbers from 1 to $num3 is ${sum1(num3)}")



// 4. make a class and create two object of the calss with two diff parameters


class Person(val name: String, val age: Int) {

    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}


    // Create two objects of the Person class with different parameters
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob", 25)

    // Display the information of both persons
    person1.displayInfo()
    person2.displayInfo()
}