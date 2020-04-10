package subtask3

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        var start = 0
        b.forEach { char ->
            start = a.indexOf(char, start, true)
            if (start == -1) return "NO"
        }
        return "YES"
    }
}
