package com.example

import com.example.worker.work

fun greet(){
    println("hello from lib-build!")
    work()
}

class CommonHello{
    fun say() = "Hello from Common!"
}