package subtask2

class TimeConverter {
    fun toTextFormat(hour: String, minute: String): String {
        val hourInt = hour.toInt()
        val minuteInt = minute.toInt()

        val numberToWord = mapOf(
            1 to "one",
            2 to "two",
            3 to "three",
            4 to "four",
            5 to "five",
            6 to "six",
            7 to "seven",
            8 to "eight",
            9 to "nine",
            10 to "ten",
            11 to "eleven",
            12 to "twelve",
            13 to "thirteen",
            14 to "fourteen",
            15 to "fifteen",
            16 to "sixteen",
            17 to "seventeen",
            18 to "eighteen",
            19 to "nineteen",
            20 to "twenty",
            21 to "twenty one",
            22 to "twenty two",
            23 to "twenty three",
            24 to "twenty four",
            25 to "twenty five",
            26 to "twenty six",
            27 to "twenty seven",
            28 to "twenty eight",
            29 to "twenty nine"
        )

        return when (minuteInt) {
            0 -> "${numberToWord[hourInt]} o' clock"
            1 -> "one minute past ${numberToWord[hourInt]}"
            in 2..14 -> "${numberToWord[minuteInt]} minutes past ${numberToWord[hourInt]}"
            15 -> "quarter past ${numberToWord[hourInt]}"
            in 16..29 -> "${numberToWord[minuteInt]} minutes past ${numberToWord[hourInt]}"
            30 -> "half past ${numberToWord[hourInt]}"
            in 31..44 -> "${numberToWord[60 - minuteInt]} minutes to ${numberToWord[hourInt + 1]}"
            45 -> "quarter to ${numberToWord[hourInt + 1]}"
            in 46..59 -> "${numberToWord[60 - minuteInt]} minutes to ${numberToWord[hourInt + 1]}"
            else -> ""
        }
    }
}
