package com.example.moshikotlincodegen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.moshi.Moshi

class MainActivity : AppCompatActivity() {
    private lateinit var mMoshi: Moshi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMoshi = Moshi.Builder().build()

        testJson("test.json")
    }

    private fun testJson(fileName: String) {
        val adapter = mMoshi.adapter(BlackjackHand::class.java)
        val fromJson = adapter.fromJson(JsonUtils.getJson(this, fileName))
        println(fromJson)
    }
}