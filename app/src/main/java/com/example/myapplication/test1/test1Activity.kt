package com.example.myapplication.test1

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class test1Activity : AppCompatActivity() {


    //인트로 코드
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1) //activity_test1 파일로 맨처음 보여짐

        SystemClock.sleep(3000) //3 초후 화면 전환
    val intent =Intent(this,MainActivity::class.java)
        startActivity(intent) // MainActivity 이동
        finish()
    }
}
