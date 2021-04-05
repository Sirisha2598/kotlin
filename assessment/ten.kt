package com.example.genkotlin1

fun main()
{
    println("Enter the year")
    var yr:Int =Integer.valueOf(readLine())
    if(((yr%4==0) && (yr%400 ==0) || (yr%100!=0)))
    {
        println(" LEAP YEAR")
    }
    else
    {
        println("NOT A LEAP YEAR")
    }
}