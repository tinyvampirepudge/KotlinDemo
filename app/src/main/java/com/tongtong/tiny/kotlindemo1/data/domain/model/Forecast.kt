package com.tongtong.tiny.kotlindemo1.data.domain.model

/**
 * (一句话功能简介)$desc$
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 18:48
 */
data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int)