package com.example.moshikotlincodegen

import android.content.Context
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

object JsonUtils {

    fun getJson(context: Context, fileName: String): String {
        val stringBuilder = StringBuilder()
        val assetManager = context.assets
        try {
            val bufferedReader =
                BufferedReader(InputStreamReader(assetManager.open(fileName), "utf-8"))
            var line: String?
            while (bufferedReader.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return stringBuilder.toString()
    }
}