class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        val l1 = a + b + c
        val l2 = (a * a) + (b * b) + (c * c)
        val l3 = (a * a * a) + (b * b * b) + (c * c * c)

        if (a == b && b == c) {
            return l1 * l2 * l3
        }
        else if (a != b && b != c && a != c) {
            return l1
        }
        else {
            return l1 * l2
        }
    }
}