package com.example.core

import com.example.utils.helloUtil
import com.example.name.namePrint

fun getGreetingMessage(): String {
    namePrint{println("my name is $name")}
    helloUtil()
    return "Hello from Core Module!"
}

class CoreHello{
    fun add(a: Int, b: Int): Int{
        return a+b
    }
}