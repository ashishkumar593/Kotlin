fun main(args:Array<String>) {
    
    //1. arrayOf(vararg elements: T): 
    val number = arrayOf(6, 7, 8, 9, 10)
    println(number.joinToString()) 

    //2. arrayOfNulls(size: Int):
    val nullArray = arrayOfNulls<String>(5)
    println(nullArray.joinToString()) 

    //3. emptyArray<T>():
    val empty = emptyArray<String>()
    println(empty.isEmpty()) 

    //4. IntArray(size: Int): 
    val intArray = IntArray(4) { it * 2 } // initializing with values
    println(intArray.joinToString()) 

    //5. DoubleArray(size: Int):
    val doubleArray = DoubleArray(4) { 2.5 }
    println(doubleArray.joinToString()) 

    //6. BooleanArray(size: Int): 
    val booleanArray = BooleanArray(4) { it % 2 == 0 }
    println(booleanArray.joinToString()) 

    //Access and Manipulation

    //7. get(index: Int): 
    val fruits = arrayOf("Mango", "Pineapple", "Grapes")
    println(fruits[2]) 
    fruits[2] = "Kiwi"
    println(fruits.joinToString()) 

    //8. size:
    val numbers = arrayOf(4, 5, 6)
    println(numbers.size) 

    //9. isEmpty(): 
    val emptyArray = arrayOf<String>()
    println(emptyArray.isEmpty()) 
    println(emptyArray.isNotEmpty()) 

    //Iteration and Transformation

    //10. forEach(action: (T) -> Unit):
    val numbers1 = arrayOf(7, 8, 9)
    numbers1.forEach { println(it) } 

    //11. map(transform: (T) -> R):
    val numbers2 = arrayOf(4, 5, 6)
    val squares = numbers2.map { it * it }
    println(squares.joinToString()) 

    //12. filter(predicate: (T) -> Boolean): 
    val numbers3 = arrayOf(10, 11, 12, 13, 14)
    val evenNumbers = numbers3.filter { it % 2 == 0 }
    println(evenNumbers.joinToString()) 

    //13. flatMap(transform: (T) -> Iterable<R>): 
    val listOfLists = arrayOf(listOf(3, 4), listOf(5, 6))
    val flattened = listOfLists.flatMap { it }
    println(flattened.joinToString()) 

    //14. reduce(operation: (acc: R, T) -> R):
    val numbers4 = arrayOf(4, 5, 6)
    val sum = numbers4.reduce { acc, i -> acc + i }
    println(sum) 

    //15. fold(initial: R, operation: (R, T) -> R):
    val numbers5 = arrayOf(7, 8, 9)
    val sum1 = numbers5.fold(15) { acc, i -> acc + i }
    println(sum1) 

    //16. indexOf(element: T):
    val fruits1 = arrayOf("Mango", "Pineapple", "Grapes")
    println(fruits1.indexOf("Pineapple")) 

    //17.lastIndexOf(element: T):
    val fruits2 = arrayOf("Mango", "Pineapple", "Grapes", "Pineapple")
    println(fruits2.lastIndexOf("Pineapple")) 

    //18. contains(element: T):
    val fruits3 = arrayOf("Mango", "Pineapple", "Grapes")
    println(fruits3.contains("Pineapple")) 

    //19. containsAll(elements: Collection<T>):
    val fruits4 = arrayOf("Mango", "Pineapple", "Grapes")
    val fruitList = fruits4.toList()
    val containsAll = fruitList.containsAll(listOf("Mango", "Grapes"))
    println(containsAll)

    //20. sort():
    val numbers6 = arrayOf(8, 6, 7, 5, 4)
    numbers6.sort()
    println(numbers6.joinToString()) 

    //21. sorted()
    val numbers7 = arrayOf(8, 6, 7, 5, 4)
    val sortedNumbers = numbers7.sorted()
    println(sortedNumbers.joinToString()) 

    //22. sortedArray()
    val numbers8 = arrayOf(8, 6, 7, 5, 4)
    val sortedArray = numbers8.sortedArray()
    println(sortedArray.joinToString()) 

    //23. sortedArrayDescending():
    val numbers9 = arrayOf(8, 6, 7, 5, 4)
    val sortedDescendingArray = numbers9.sortedArrayDescending()
    println(sortedDescendingArray.joinToString()) 

    //24. reverse()
    val numbers10 = arrayOf(4, 5, 6, 7, 8)
    numbers10.reverse()
    println(numbers10.joinToString()) 

    //25. reversed()
    val numbers11 = arrayOf(4, 5, 6, 7, 8)
    val reversedNumbers = numbers11.reversed()
    println(reversedNumbers.joinToString()) 

    //26. toList()
    val numbers12 = arrayOf(7, 8, 9)
    val numberList = numbers12.toList()
    println(numberList)

    //27. toSet()
    val numbers13 = arrayOf(7, 8, 8, 9)
    val numberSet = numbers13.toSet()
    println(numberSet) 

    //28. toMutableList()
    val numbers14 = arrayOf(7, 8, 9)
    val mutableList = numbers14.toMutableList()
    mutableList.add(10)
    println(mutableList) 

    //29. toTypedArray()
    val list = listOf(7, 8, 9)
    val array = list.toTypedArray()
    println(array.joinToString()) 

    //30. copyOf(newSize: Int):
    val numbers15 = arrayOf(4, 5, 6)
    val copiedArray = numbers15.copyOf(6)
    println(copiedArray.joinToString()) 

    //31. copyOfRange(from: Int, to: Int):
    val numbers16 = arrayOf(4, 5, 6, 7, 8)
    val rangeCopy = numbers16.copyOfRange(2, 5)
    println(rangeCopy.joinToString()) 

    //32. fill(value: T):
    val numbers17 = arrayOf(7, 8, 9)
    numbers17.fill(1)
    println(numbers17.joinToString()) 

    //33. slice(indices: IntRange):
    val numbers18 = arrayOf(7, 8, 9, 10, 11)
    val slicedList = numbers18.slice(2..4)
    println(slicedList) 

    //34. val numbers = arrayOf(7, 8, 9, 10, 11)
    val numbers19 = arrayOf(7, 8, 9, 10, 11)
    val slicedList1 = numbers19.slice(2..4)
    println(slicedList1) 

    //35. sliceArray(indices: IntArray):
    val numbers20 = arrayOf(7, 8, 9, 10, 11)
    val indices = listOf(2, 4) // Using List<Int>
    val slicedArray = numbers20.sliceArray(indices)
    println(slicedArray.joinToString()) 

}
