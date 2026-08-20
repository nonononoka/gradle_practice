package com.example.name

class A(val name: String)

fun namePrint(block: A.()->Unit){
    val a = A("alice")
    a.block()
}