package com.tongtong.tiny.kotlindemo1.part01

import android.util.Log
import java.net.URL

/**
 * (一句话功能简介)$desc$
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 16:32
 */
class Request(val url: String) {

    fun run(): String {
        Log.e(javaClass.simpleName, "Thread.currentThread():" + Thread.currentThread())
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
        return forecastJsonStr
    }
}
