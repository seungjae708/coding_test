class Solution {
    fun solution(n: Int, m: Int): IntArray = intArrayOf(gcd(n, m), (n * m) / gcd(n ,m))    
    private fun gcd(a: Int, b:Int): Int = if (b != 0) gcd(b, a % b) else a
}