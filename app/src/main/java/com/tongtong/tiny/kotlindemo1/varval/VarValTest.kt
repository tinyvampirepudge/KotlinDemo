package com.tongtong.tiny.kotlindemo1.varval

/**
 * @Description: lateinit
 * https://juejin.cn/post/6844903798486368264
 * @Author wangjianzhou
 * @Date 4/4/22 3:03 PM
 * @Version TODO
 */

fun main(args: Array<String>) {
    println("莫挨老子哦")
    val test = VarValClassTest()
    test.foo()
    test.goo()
    test.hoo()
}

class VarValClassTest {
    // lateinit只能用于var
    private lateinit var s: String

    private val abc by lazy {
        println("abc lazy")
        "adsf"
    }

    var name: String? = null
        set(value) {
            field = value
        }
        get() = field

    var name1: String? = null
        set(value) {
            println("name1 set value: $value")
            field = "asdfafd"
        }
        get() = field

    val val1: String = ""
        get() = field

    fun foo() {
        s = "foo"
        println(s)
    }

    fun goo() {
        println(abc)
    }

    fun hoo() {
        name = "大发送方的"
        name1 = "13412341234"
        println(name)
        println(name1)
    }
}