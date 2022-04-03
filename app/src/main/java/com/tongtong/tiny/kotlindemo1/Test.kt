package com.tongtong.tiny.kotlindemo1


/**
 * desc
 *
 * @author wangjianzhou
 * @version version
 * @date 2018/8/8 10:27 PM
 */

var age = 18

var name = "Dan Dan"
var name2: String? = null

fun main(args: Array<String>) {
//    name = name2!!
    printLen("王蛋蛋的的father")
    printLen1("王蛋蛋的mother")
    printLen1("我是$name")
}

fun printLen(str: String): String {
    println(str)
    return str
}

fun printLen1(str: String): Unit {
    println(str)
}