package com.example.genkotlin1

import java.util.*fun main()
{
    var sc = Scanner(System.`in`)
    println("Enter the  number")
    var v = sc.nextInt()
    var b=0
    for(i in 1..v) {
        for (j in 1..i) {
            if (i%j==0)
                b++
        }
        if(b==2)
            println(i)
        b=0
    }

}