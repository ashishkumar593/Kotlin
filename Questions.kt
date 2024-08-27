
// Q1. Write a program using loops to print even and odd numbers
fun main(args: Array<String>) {
    var a = 1
    var b = 20
    println("even numbers are: ")
    for(i in a..b){
        
        if(i%2==0){
            println(i)
            }
        }
    println("odd numbers are: ")
    for(i in a..b){
        if(i%2!=0){
            println(i)
        }
    }   
}

// Q2. Write a program for a calculator using different operators
fun main(args: Array<String>){
    var a = 10
    var b = 5
	println("1. Addition (+) = ${a+b}")
    
	println("2. Subtraction (-) = ${a-b}")
    
	println("3. Multiplication (*) = ${a*b}")
    
	println("4. Division (/) = ${a/b}")
    
	println("5. Modulus (%) = ${a%b}")
    
	println("6. Increment (++) = ${a++}")
    
    println(" After incrementing a = ${a}")
    
	println("7. Decrement (--) = ${b--}")
    
    println(" After decrementing b = ${b--}")
    
    println("8. a==b : ${a==b} and a!=b : ${a!=b}")

    println("9. a>b = ${a>b} and a<b ${a<b} ")
    
    println("10. a>=b = ${a>=b} and a<=b ${a<=b}")
    
    
}