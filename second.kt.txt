package com.example.myfirstapplication

fun main()
{
    println("Enter the radius")
    var radius:Int=Integer.valueOf(readLine())
    var area : Double=0.0
    var perimeter : Double=0.0
    area = 3.14*radius*radius
    perimeter=2*3.14*radius
    var perimetersq= perimeter/4
    println("AREA OF CIRCLE IS: $area")
    println("PERIMETER OF CIRCLE IS: $perimeter")
    println("LENGTH OF SQUARE IS:$perimetersq")
}