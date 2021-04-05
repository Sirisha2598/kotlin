package com.example.genkotlin1

fun main()
{
    println("Enter the marks of 1st subject")
    var m1: Int= Integer.valueOf(readLine())
    println("Enter the marks of 2nd subject")
    var m2: Int=Integer.valueOf(readLine())
    println("Enter the marks of 3rd subject")
    var m3: Int=Integer.valueOf(readLine())
    var total:Int= m1+m2+m3
    var per: Double= (total/3).toDouble()
    println(" Total Score is $total")
    println("Percentage is $per")
}