package com.tongtong.tiny.kotlindemo1.data

import java.util.*

/**
 * polo类
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 17:45
 */
data class ForecastTest(val date: Date, val temperature: Float, val details: String) {
    override fun toString(): String {
        return "ForecastTest(date=$date, temperature=$temperature, details='$details')"
    }
}