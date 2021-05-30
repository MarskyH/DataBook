package com.example.databook.dataBase

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.google.gson.JsonElement
import java.io.ByteArrayOutputStream


class Converters {
    @TypeConverter
    fun fromBitmap(bitmap: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }
    @TypeConverter
    fun toBitmap(byteArray: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
    }
}

