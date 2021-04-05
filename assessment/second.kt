package com.example.genkotlin1

fun main()
{
    println("Enter the r")
    var r:Int=Integer.valueOf(readLine())
    var area : Double=0.0
    var perimeter : Double=0.0
    area = 3.14*r*r
    perimeter=2*3.14*r
    var perimetersquare= perimeter/4
    println("AREA OF CIRCLE IS: $area")
    println("PERIMETER OF CIRCLE IS: $perimeter")
    println("LENGTH OF SQUARE IS:$perimetersquare")
}
