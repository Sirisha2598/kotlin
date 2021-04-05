package com.example.genkotlin1

fun main()
{
    println("Enter ")
    var quantity=Integer.valueOf(readLine())
    var unitprice=Integer.valueOf(readLine())
    var total=quantity*unitprice
    var dis:Float= ((total*15)/100).toFloat()
    var bill=total-dis
    println("The discount amount is: $dis")
    println("The final bill amount is: $bill")
}
