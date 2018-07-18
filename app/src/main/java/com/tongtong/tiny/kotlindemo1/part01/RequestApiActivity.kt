package com.tongtong.tiny.kotlindemo1.part01

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.tongtong.tiny.kotlindemo1.R
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread

class RequestApiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_api)

        val tv1: TextView? = find(R.id.tv1)

        val b1: Button? = find(R.id.btn_test1)
        b1?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                toast("请求api数据")
                doAsync {
                    val url = "https://openweathermap.org/city/1816670"
                    val request = Request(url)
                    var result = request.run()
                    uiThread {
                        tv1?.text = result
                        Log.e(javaClass.simpleName, "Thread.currentThread():" + Thread.currentThread())
                    }
                }
            }

        })
    }
}
