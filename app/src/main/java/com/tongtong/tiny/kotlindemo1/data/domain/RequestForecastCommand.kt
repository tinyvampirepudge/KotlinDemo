package com.tongtong.tiny.kotlindemo1.data.domain

import com.tongtong.tiny.kotlindemo1.data.ForecastRequest
import com.tongtong.tiny.kotlindemo1.data.domain.model.ForecastList

/**
 * (一句话功能简介)$desc$
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 19:07
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}