package com.example.utils

import com.example.CommonHello

fun helloUtil(){
    println("hello from util!")
    val u = UtilsHello()
    u.doSomething()
}

class UtilsHello{
    fun doSomething(){
        val common = CommonHello() // これは当然できる
        println(common.say())
    }
}