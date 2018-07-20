package com.tongtong.tiny.kotlindemo1.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.tongtong.tiny.kotlindemo1.R
import com.tongtong.tiny.kotlindemo1.extend.funExtendTest
import org.jetbrains.anko.find

/**
 * 基本语法
 */
class BasicSyntaxActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_syntax)
        //基本类型
        basicType1()
        basicType2()
        basicType3()
        basicType4()
        basicType5()

        //bean
        var person = Person()
        person.name = "maolegemi"
        println(person)

        var personKotlin = PersonKotlin()
        personKotlin.name = "hahahah"
        println(personKotlin)

        var personKotlinModified = PersonKotlinModified()
        personKotlinModified.name = "kotlin自定义的bean"
        personKotlinModified.age = 27
        println(personKotlinModified)

        val b1: Button? = find(R.id.btn_test1)
        b1?.setOnClickListener(this)

        /**
         * 字符串模板
         */
        var b3 : Button? = find(R.id.btn_test3)
        b3?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val i = 10
                println("i = $i")

                val s = "abc"
                println("$s.length is ${s.length}")

                val price = "${'$'}9.99"
                println("price is $price")
            }

        })
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_test1 -> {
                funExtendTest("我是扩展Context的方法")
            }
        }
    }

    /*
    当然，像integer，float或者boolean等类型仍然存在，但是它们全部都会作为对象存在的。
    基本类型的名字和它们工作方式都是与Java非常相似的，但是有一些不同之处你可能需要考虑到：
     */

    /*
     数字类型中不会自动转型。举个例子，你不能给Double变量分配一个Int。必须要做一个明确的类型转换，
     可以使用众多的函数之一：
     */
    fun basicType1() {
        println("basicType1")
        var i: Int = 7
        val d: Double = i.toDouble()
        i = 3
    }

    /*
    字符（Char）不能直接作为一个数字来处理。在需要时我们需要把他们转换为一个数字：
     */
    fun basicType2() {
        println("basicType2")
        var c: Char = 'c'
        var i: Int = c.toInt()
    }

    val FLAG1: Int = 1
    val FLAG2: Int = 2

    /*
    位运算也有一点不同。在Android中，我们经常在flags中使用“或”，所以我使用"and"和"or来举例
    还有很多其他的位操作符，比如sh1, shs, ushr, xor或inv。当我们需要的时候，可以在Kotlin官网查看。
     */
    fun basicType3() {
        println("basicType3")
        var bitbiseOr = FLAG1 or FLAG2
        var bitwiseAnd = FLAG1 and FLAG2
    }

    /*
    字面上可以写明具体的类型。这个不是必须的，但是一个通用的Kotlin实践时省略变量的类型（我们马上就能看到），
    所以我们可以让编译器自己去推断出具体的类型。
     */
    fun basicType4() {
        println("basicType4")
        val i = 12
        val iHex = 0x0f
        val l = 3L
        val d = 3.5
        val f = 3.5F
    }

    /*
    一个String可以像数组那样访问，并且被迭代：
     */
    fun basicType5() {
        println("basicType5")
        val s = "Example"
        val c = s[2]//这时一个字符'a'
        //迭代String
        for (c in s) {
            println(c)
        }
    }

}
