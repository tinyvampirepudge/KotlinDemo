package com.tongtong.tiny.kotlindemo1.data

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.tongtong.tiny.kotlindemo1.R
import com.tongtong.tiny.kotlindemo1.data.domain.RequestForecastCommand
import com.tongtong.tiny.kotlindemo1.data.domain.model.ForecastList
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread

/**
 * 展示真实的日期列表数据
 */
class ForecastListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast_list)

        val rv: RecyclerView? = find(R.id.forecast_rv)
        rv?.layoutManager = LinearLayoutManager(this)
        doAsync {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                rv?.adapter = ForecastListAdapter(result)
            }
        }
    }

    class ForecastListAdapter(val weekForecast: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(TextView(parent.context))
        }

        override fun getItemCount(): Int {
            return weekForecast.dailyForecast.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            with(weekForecast.dailyForecast[position],
                    {
                        holder.textView.text = "$date - $description - $high/$low"
                    })
        }

        class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
    }
}
