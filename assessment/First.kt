package com.example.genkotlin1
fun main(args: Array<String>) {
    println("enter first number")
    var a : Int =Integer.valueOf(readLine())
    println("enter second number")
  var b :Int=Integer.valueOf(readLine())
   val add = a+b
    val sub= a-b
    val multi=a*b
    val div =a/b
    println( "The  addition is : $add")
    println("The subtraction is : $sub")
    println("The multiplication is : $multi")
    println("The  division is : $div")
}