class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var finalDenom = denom1 * denom2 
        var finalNumer = numer1 * denom2 + numer2 * denom1
        val finalGcd = gcd(finalNumer, finalDenom)
        return intArrayOf(finalNumer/finalGcd, finalDenom/finalGcd)
    }
    
    private fun gcd(a: Int, b: Int): Int{
        var num1 = a
        var num2 = b
        while (num2 != 0){
            val temp = num2
            num2 = num1 % num2 
            num1 = temp
        }
        return num1
    }
}