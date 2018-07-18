package com.tongtong.tiny.kotlindemo1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.tongtong.tiny.kotlindemo1.part01.BasicSyntaxActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    /**
     * 当某个变量的值可以为null的时候，必须在声明处的类型后添加？来表示该引用可为空。
     */
    private var b1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById(R.id.btn_test1)

        b1?.setOnClickListener(this)
    }

    /**
     * 覆盖View.OnclickListener接口中的onClick方法。
     */
    override fun onClick(v: View?){
        when(v?.id){
            R.id.btn_test1 -> {
                var intent = Intent(this, BasicSyntaxActivity::class.java)
                startActivity(intent)
            }
        }
    }

}
