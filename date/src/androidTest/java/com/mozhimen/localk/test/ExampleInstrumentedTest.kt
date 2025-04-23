package com.mozhimen.localk.test

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mozhimen.kotlin.elemk.java.util.cons.CDateFormat
import com.mozhimen.kotlin.utilk.android.text.UtilKDateFormatFormat
import com.mozhimen.kotlin.utilk.java.text.UtilKSimpleDateFormatFormat

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.Date
import java.util.Locale

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val str1 = UtilKDateFormatFormat.date2strDate(Date(), Locale.CHINESE,CDateFormat.Skeleton.YYYYMMMMd)
        val str2 =UtilKSimpleDateFormatFormat.date2strDate(Date(), Locale.CHINESE,CDateFormat.Skeleton.YYYYMMMMd)
        println(str1)
        println(str2)
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.mozhimen.localk.test", appContext.packageName)
    }
}