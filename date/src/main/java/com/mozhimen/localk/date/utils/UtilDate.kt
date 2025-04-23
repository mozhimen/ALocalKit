package com.mozhimen.localk.date.utils

import com.mozhimen.kotlin.elemk.java.util.cons.CDateFormat
import com.mozhimen.kotlin.utilk.java.text.date2strDate
import com.mozhimen.kotlin.utilk.java.text.longDate2date
import com.mozhimen.kotlin.utilk.java.text.longDate2strDate
import com.mozhimen.kotlin.utilk.java.text.strDate2date
import java.util.Locale

/**
 * @ClassName UtilDate
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/4/15
 * @Version 1.0
 */
fun Long.longDate2strDate(locale: Locale, skeleton: String): String =
    UtilDate.longDate2strDate(this, locale, skeleton)

fun String.strDate2strDate(strFormatDate: String, locale: Locale, skeleton: String): String =
    UtilDate.strDate2strDate(this, strFormatDate, locale, skeleton)

///////////////////////////////////////////////////////////////////////////

object UtilDate {
    @JvmStatic
    fun strDate2strDate(strDate: String, strFormatDate: String, locale: Locale, skeleton: String): String {
        try {
            return strDate.strDate2date(strFormatDate, locale)?.date2strDate(locale, skeleton) ?: strDate
        } catch (e: Exception) {
            e.printStackTrace()
            return strDate
        }
    }

    /**
     * @param skeleton CDateFormat.Skeleton.YYYYMMMMd
     */
    @JvmStatic
    fun longDate2strDate(longDate: Long, locale: Locale, skeleton: String): String {
        try {
            return longDate.longDate2date().date2strDate(locale, skeleton)
        } catch (e: Exception) {
            e.printStackTrace()
            return longDate.longDate2strDate(CDateFormat.Format.`yyyy-MM-dd`, locale)
        }
    }
}