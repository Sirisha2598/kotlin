package com.example.genkotlin1

fun main()
{
    var num=0
    var num1 =1
    println("Enter the number")
    var num2= Integer.valueOf(readLine())
    println("Fib of first $num2 is:")
    for (i in 1..num2)
    {
        println("$num")
        val sum= num+num1
        num=num1
        num1=sum
    }
}
