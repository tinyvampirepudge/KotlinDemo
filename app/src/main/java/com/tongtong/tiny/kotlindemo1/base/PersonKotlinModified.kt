package com.tongtong.tiny.kotlindemo1.base

/**
 * kotlin 书写的person类，这里对name属性，不适用默认的getter和setter，而是修改为自定义
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 15:11
 */
class PersonKotlinModified {
    var name:String = ""
        get() {
            return field.toUpperCase()
        }
        set(value) {
            field = "Name: $value"
        }
    var age:Int = 0
    override fun toString(): String {
        return "PersonKotlinModified(name=$name,age=$age)"
    }

}