package com.tongtong.tiny.kotlindemo1.extend

/**
 * @Description: 扩展函数
 *
 * @Author wangjianzhou
 * @Date 4/4/22 5:42 PM
 * @Version
 */

open class Shape {
    fun foo1() = 123

    var field1 = 123
    val field2 = 456
}

class Rectangle : Shape()

/**
 * 扩展函数
 */
fun Shape.getName() = "Shape"

/**
 * 扩展函数
 */
fun Rectangle.getName() = "Rectangle"

fun Shape.foo() = 456

/**
 * 扩展属性
 */
var Shape.field3: Int
    get() = field2 + 1
    set(value) {

    }

var Shape.field2: Int
    get() = field1 + 1
    set(value) {

    }

fun printClassName(s: Shape) {
    println(s.getName())
}

fun main(args: Array<String>) {

    printClassName(Rectangle())

    val shape = Shape()
    println("shape.foo(): ${shape.foo()}")
    println("shape.field3: ${shape.field3}")
    shape.field3 = 789
    println("shape.field3: ${shape.field3}")
    println("shape.field2: ${shape.field2}")
}