package com.example.core

import com.example.utils.helloUtil
import com.example.name.namePrint


fun getGreetingMessage(): String {
    namePrint{println("my name is $name")}
    helloUtil()
    return "Hello from Core Module!"
}