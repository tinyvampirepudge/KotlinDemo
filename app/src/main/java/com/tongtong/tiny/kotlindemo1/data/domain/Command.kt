package com.tongtong.tiny.kotlindemo1.data.domain

/**
 * 这个command会执行一个操作并且返回某种类型的对象，这个类型可以通过范型被指定
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 18:46
 */
interface Command<T> {
    fun execute(): T
}