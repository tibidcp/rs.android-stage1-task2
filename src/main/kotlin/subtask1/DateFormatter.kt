package subtask1

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import java.time.YearMonth
import java.time.format.TextStyle
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val yearInt = year.toInt()
        val dayInt = day.toInt()
        val monthInt = month.toInt()
        if (monthInt > 12 || dayInt > YearMonth.of(yearInt, monthInt).lengthOfMonth()) {
            return "Такого дня не существует"
        }
        val date = LocalDate.of(yearInt, monthInt, dayInt)
        val dayOfWeek = date.dayOfWeek.getDisplayName(TextStyle.FULL, Locale("ru"))
        val monthValue = date.month.getDisplayName(TextStyle.FULL, Locale("ru"))
        return "$day $monthValue, $dayOfWeek"
    }
}
