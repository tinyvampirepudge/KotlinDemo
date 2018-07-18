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
                val f1 = ForecastTest(Date(), 27.5f, "Shiny day")
                val f2 = f1.copy(temperature = 30f)
                println(javaClass.simpleName + " f1:" + f1.toString())
                println(javaClass.simpleName + " f2:" + f2.toString())
            }

        })

        val b2: Button? = find(R.id.btn_test2)
        b2?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var f3 = ForecastTest(Date(), 33.3f, "今天是晴天啊，心里美滋滋啊！")
                println(javaClass.simpleName + " f3:" + f3.toString())
                /**
                 * 映射对象的每一个属性到一个变量中，这个过程就是我们知道的多声明。
                 */
                val (date, temperature, details) = f3
                println(javaClass.simpleName + " date:" + date)
                println(javaClass.simpleName + " temperature:" + temperature)
                println(javaClass.simpleName + " details:" + details)

                /**
                 * 可以只映射一部分，顺序跟bean中定义的一致
                 */
                val (date1, details1) = f3
                println(javaClass.simpleName + " date1:" + date1)
//                println(javaClass.simpleName + " temperature:" + temperature)
                println(javaClass.simpleName + " details1:" + details1)

                /**
                 * 多声明跟下面的代码等价
                 */

                val date2 = f3.component1()
                val temperature2 = f3.component2()
                val details2 = f3.component3()
                println(javaClass.simpleName + " component1:" + date2)
                println(javaClass.simpleName + " component2:" + temperature2)
                println(javaClass.simpleName + " component3:" + details2)
            }

        })

    }
}
