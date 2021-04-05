package com.example.genkotlin1
import java.util.*
fun main(args:Array<String>)
{
    val reader = Scanner(System.`in`)
    println("Size of Array: ")
    val size = reader.nextInt()
    var a= Array(size){0}
    for (i in 0..size-1)
    {
        println("Enter the ${i+1} element in array")
        var b: Int = reader.nextInt()
        a[i]=b
    }

    println("Elements in the array are:")
    for (i in a) {
        println(i)
    }

    var n = a.size
    var large =  a[0]

    var l : (Int) -> Unit = { l: Int -> for (i in 1..n - 1) { if (a[i] > large){ large = a[i] } } }

    l(a[0])

    println("Largest number in array is $large")

    var small =  a[0]
    var k : (Int) -> Unit = { k: Int ->
        for (i in 1..n - 1) {
            if (a[i] < small)
            {
                small = a[i]
            }
        }
    }
    k(a[0])
    println("Smallest number in array is $small")
}