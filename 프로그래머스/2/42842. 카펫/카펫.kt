class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow
        var h = 3
        
        while (h * h <= total) {
            if (total % h != 0) {
                h++
                continue
            }
            
            val w = total / h
            
            if ((w - 2) * (h - 2) == yellow) {
                return intArrayOf(w, h)
            }
            
            h++
        }
        
        return intArrayOf()
    }
}