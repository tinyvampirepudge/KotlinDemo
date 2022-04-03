package com.tongtong.tiny.kotlindemo1.data.domain.model


/**
 * (一句话功能简介)$desc$
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 18:47
 */
data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>)