package com.example.genkotlin1

import java.util.*
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    var k=sc.nextInt()
    palindrome(k)

}
fun palindrome(a:Int):Unit
{
    var i=1
    var count=1
    var l=ArrayList<Int>()
    l.add(0)
    while(count<=a-1)
    {
        var i1=i
        var j=1
        var t=0
        while(i>0)
        {
            var p=i%10
            t=t*10+p
            i=i/10
        }
        if(i1==t){
            l.add(i1)
            count++
        }
        i=i1+j
    }
    for(v in l)
    {
        print(v)
        print(" ")
    }
}