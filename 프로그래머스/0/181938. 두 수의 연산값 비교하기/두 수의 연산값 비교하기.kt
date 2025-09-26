class Solution {
    fun solution(a: Int, b: Int): Int {
        val ab = (a.toString() + b.toString()).toInt()
        val c = 2 * a * b
        
        if (ab>=c){
            return ab
        } else {
            return c
        }
    }
}