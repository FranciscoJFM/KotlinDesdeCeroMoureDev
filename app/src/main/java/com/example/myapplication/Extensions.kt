package com.example.myapplication

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.logging.SimpleFormatter

fun Date?.customFormat(): String? {
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    if (this != null) {
        return formatter.format(this)
    }
    return null
}

val Date?.formatSizer:Int
    get() =this.customFormat()?.length ?:0