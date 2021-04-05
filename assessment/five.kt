package com.example.genkotlin1

import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    print("Enter  x  : ")
    val x: Int = sc.nextInt()
    val myLambda: (Int) -> Unit= {p: Int -> println(p) } //lambda function
    fact(x,myLambda)
}
fun fact(b: Int, mylambda: (Int) -> Unit ){
    var x=1//high level function lambda as parameter
    for(i in 1..b){x=x*i}
    mylambda(x)
}