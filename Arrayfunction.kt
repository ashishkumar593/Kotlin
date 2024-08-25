fun main(args:Array<String>) {
    
    //1. arrayOf(vararg elements: T): Creates a new array with the specified elements.
    val number = arrayOf(1, 2, 3, 4, 5)
println(number.joinToString()) // Output: 1, 2, 3, 4, 5

//2. arrayOfNulls(size: Int): Creates an array of the specified size filled with null values.
val nullArray = arrayOfNulls<String>(3)
println(nullArray.joinToString()) // Output: null, null, null

//3. emptyArray<T>(): Creates an empty array.
val empty = emptyArray<String>()
println(empty.isEmpty()) // Output: true

//4. IntArray(size: Int): Creates an array of integers with the specified size.
val intArray = IntArray(3)
println(intArray.joinToString()) // Output: 0, 0, 0

//5. DoubleArray(size: Int): Creates an array of doubles with the specified size.
val doubleArray = DoubleArray(3) { 1.0 }
println(doubleArray.joinToString()) // Output: 1.0, 1.0, 1.0

//6. BooleanArray(size: Int): Creates an array of booleans with the specified size.
val booleanArray = BooleanArray(3)
println(booleanArray.joinToString()) // Output: false, false, false

//Access and Manipulation

//7. get(index: Int): Returns the element at the specified index.
val fruits = arrayOf("Apple", "Banana", "Cherry")
println(fruits[1]) // Output: Banana
fruits[1] = "Blueberry"
println(fruits.joinToString()) // Output: Apple, Blueberry, Cherry

//8. size: Returns the number of elements in the array.
val numbers = arrayOf(1, 2, 3)
println(numbers.size) // Output: 3

//9. isEmpty(): Returns true if the array is empty.
val emptyArray = arrayOf<String>()
println(emptyArray.isEmpty()) // Output: true
println(emptyArray.isNotEmpty()) // Output: false

//Iteration and Transformation

//10. forEach(action: (T) -> Unit): Applies the given action to each element.
val numbers1 = arrayOf(1, 2, 3)
numbers1.forEach { println(it) } // Output: 1 2 3

//11. map(transform: (T) -> R): Returns a list of the results of applying the transformation to each element.
val numbers2 = arrayOf(1, 2, 3)
val squares = numbers2.map { it * it }
println(squares.joinToString()) // Output: 1, 4, 9

//12. filter(predicate: (T) -> Boolean): Returns a list containing only elements that match the given predicate.
val numbers3 = arrayOf(1, 2, 3, 4, 5)
val evenNumbers = numbers3.filter { it % 2 == 0 }
println(evenNumbers.joinToString()) // Output: 2, 4

//13. flatMap(transform: (T) -> Iterable<R>): Returns a list of the results of applying the transformation to each element, then flattening the results.
val listOfLists = arrayOf(listOf(1, 2), listOf(3, 4))
val flattened = listOfLists.flatMap { it }
println(flattened.joinToString()) // Output: 1, 2, 3, 4

//14. reduce(operation: (acc: R, T) -> R): Accumulates a value starting with the first element and applying the operation from left to right.
val numbers4 = arrayOf(1, 2, 3)
val sum = numbers4.reduce { acc, i -> acc + i }
println(sum) // Output: 6

//15. fold(initial: R, operation: (acc: R, T) -> R): Accumulates a value starting with the initial value and applying the operation from left to right.
val numbers5 = arrayOf(1, 2, 3)
val sum1 = numbers5.fold(10) { acc, i -> acc + i }
println(sum1) // Output: 16

//16. indexOf(element: T):
val fruits1 = arrayOf("Apple", "Banana", "Cherry")
println(fruits1.indexOf("Banana")) // Output: 1

//17.lastIndexOf(element: T):
val fruits2 = arrayOf("Apple", "Banana", "Cherry", "Banana")
println(fruits2.lastIndexOf("Banana")) // Output: 3

//18. contains(element: T):
val fruits3 = arrayOf("Apple", "Banana", "Cherry")
println(fruits3.contains("Banana")) // Output: true

//19. containsAll(elements: Collection<T>):
val fruits4 = arrayOf("Apple", "Banana", "Cherry")
val fruitList = fruits4.toList()
val containsAll = fruitList.containsAll(listOf("Banana", "Cherry"))
println(containsAll)// Output: true

//20. sort():
val numbers6 = arrayOf(5, 3, 4, 1, 2)
numbers6.sort()
println(numbers6.joinToString()) // Output: 1, 2, 3, 4, 5

//21. sorted()
val numbers7 = arrayOf(5, 3, 4, 1, 2)
val sortedNumbers = numbers7.sorted()
println(sortedNumbers.joinToString()) // Output: 1, 2, 3, 4, 5

//22. sortedArray()
val numbers8 = arrayOf(5, 3, 4, 1, 2)
val sortedArray = numbers8.sortedArray()
println(sortedArray.joinToString()) // Output: 1, 2, 3, 4, 5

//23. sortedArrayDescending():
val numbers9 = arrayOf(5, 3, 4, 1, 2)
val sortedDescendingArray = numbers9.sortedArrayDescending()
println(sortedDescendingArray.joinToString()) // Output: 5, 4, 3, 2, 1

//24. reverse()
val numbers10 = arrayOf(1, 2, 3, 4, 5)
numbers10.reverse()
println(numbers10.joinToString()) // Output: 5, 4, 3, 2, 1

//25. reversed()
val numbers11 = arrayOf(1, 2, 3, 4, 5)
val reversedNumbers = numbers11.reversed()
println(reversedNumbers.joinToString()) // Output: 5, 4, 3, 2, 1

//26. toList()
val numbers12 = arrayOf(1, 2, 3)
val numberList = numbers12.toList()
println(numberList) // Output: [1, 2, 3]

//27. toSet()
val numbers13 = arrayOf(1, 2, 2, 3)
val numberSet = numbers13.toSet()
println(numberSet) // Output: [1, 2, 3]

//28. toMutableList()
val numbers14 = arrayOf(1, 2, 3)
val mutableList = numbers14.toMutableList()
mutableList.add(4)
println(mutableList) // Output: [1, 2, 3, 4]

//29. toTypedArray()
val list = listOf(1, 2, 3)
val array = list.toTypedArray()
println(array.joinToString()) // Output: 1, 2, 3

//30 copyOf(newSize: Int):
val numbers15 = arrayOf(1, 2, 3)
val copiedArray = numbers15.copyOf(5)
println(copiedArray.joinToString()) // Output: 1, 2, 3, 0, 0

//31. copyOfRange(from: Int, to: Int):
val numbers16 = arrayOf(1, 2, 3, 4, 5)
val rangeCopy = numbers16.copyOfRange(1, 4)
println(rangeCopy.joinToString()) // Output: 2, 3, 4

//32. fill(value: T):
val numbers17 = arrayOf(1, 2, 3)
numbers17.fill(0)
println(numbers17.joinToString()) // Output: 0, 0, 0

// //33. slice(indices: IntRange):
val numbers18 = arrayOf(1, 2, 3, 4, 5)
val slicedList = numbers18.slice(1..3)
println(slicedList) // Output: [2, 3, 4]

// //34. val numbers = arrayOf(1, 2, 3, 4, 5)
val numbers19 = arrayOf(1, 2, 3, 4, 5)
val slicedList1 = numbers19.slice(1..3)
println(slicedList1) // Output: [2, 3, 4]

// //35. sliceArray(indices: IntArray):
val numbers20 = arrayOf(1, 2, 3, 4, 5)
val indices = listOf(1, 3) // Using List<Int>
val slicedArray = numbers20.sliceArray(indices)
println(slicedArray.joinToString()) // Output: 2, 4

}