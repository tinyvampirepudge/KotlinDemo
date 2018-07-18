package com.tongtong.tiny.kotlindemo1.extend

import android.content.Context
import android.widget.TextView
import android.widget.Toast

/**
 * 扩展方法，拓展属性
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 15:52
 */

/**
 * 拓展Context的方法
 */
fun Context.funExtendTest(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

/**
 * 拓展TextView的text的属性.
 * 扩展函数也可以是一个属性。所以我们可以通过相似的方法来扩展属性。
 * 下面的例子展示了使用他自己的getter/setter生成一个属性的方式。
 * Kotlin由于互操作性的特性已经提供了这个属性，但理解扩展属性背后的思想
 * 是一个很不错的练习：
 */
public var TextView.text: CharSequence
    get() = text
    set(value) {
        text = value
    }