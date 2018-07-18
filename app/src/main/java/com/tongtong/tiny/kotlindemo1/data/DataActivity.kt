package com.tongtong.tiny.kotlindemo1.data

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.tongtong.tiny.kotlindemo1.R
import org.jetbrains.anko.find
import java.util.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val b1: Button? = find(R.id.btn_test1)
        b1?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val f1 = Forecast(Date(), 27.5f, "Shiny day")
                val f2 = f1.copy(temperature = 30f)
                println(javaClass.simpleName+ " f1:" + f1.toString())
                println(javaClass.simpleName+ " f2:" + f2.toString())
            }

        })


    }
}
