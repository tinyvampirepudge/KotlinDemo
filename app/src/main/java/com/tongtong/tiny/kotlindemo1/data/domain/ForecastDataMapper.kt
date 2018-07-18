package com.tongtong.tiny.kotlindemo1.data.domain

import com.tongtong.tiny.kotlindemo1.data.bean.Forecast
import com.tongtong.tiny.kotlindemo1.data.bean.ForecastResult
import com.tongtong.tiny.kotlindemo1.data.domain.model.ForecastList
import java.text.DateFormat
import java.util.*
import com.tongtong.tiny.kotlindemo1.data.domain.model.Forecast as ModelForecast

/**
 * 数据解析，将ForecastResult类型解析为ForecastList类型
 * (功能详细描述)$detail$
 * (修改者，修改日期，修改内容)$modify$
 * @author wangjianzhou@qding.me
 * @version APP版本号（以修改为准）$version$
 * @date 2018/7/18 18:52
 */
class ForecastDataMapper {
    /**
     * 将ForecastList数据转换为ForecastResult
     */
    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(forecast.city.name,
                forecast.city.country,
                convertForecastListToDomain(forecast.list))
    }

    /**
     * 将请求到的List<Forecast>转换为List<ModelForecast>
     */
    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.map {
            convertForecastItemToDomain(it)
        }
    }

    /**
     * 将ForecastResult中的item数据转换为Forecast数据
     *
     */
    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt),
                forecast.weather[0].description, forecast.temp.max.toInt(),
                forecast.temp.min.toInt())
    }

    /**
     * 将Long类型的日期转换为Sting类型的日期
     */
    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}