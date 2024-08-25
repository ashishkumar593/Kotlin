fun main() {
    
    val purchase: Int = 1200
    val member: Boolean = true
    if (purchase >= 1000) {
        if (member) {
            println("20% discount!")
        }
        else {
            println("10% discount!")
        }
    } 
    else {
        println("No discount.")
    }
}