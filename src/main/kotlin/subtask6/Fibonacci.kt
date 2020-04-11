package subtask6

class Fibonacci {
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var n1 = 0
        var n2 = 1
        while (n > n1 * n2) {
            val n3 = n1 + n2
            n1 = n2
            n2 = n3
        }
        return if (n == n1 * n2) {
            intArrayOf(n1, n2, 1)
        } else {
            intArrayOf(n1, n2, 0)
        }
    }
}
