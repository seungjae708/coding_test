class Solution {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf(n)
        var current = n
        
        while(current != 1) {
            if (current % 2 == 0) {
                current /= 2
            } else {
                current = current * 3 + 1
            }
            answer.add(current)
        }
        
        return answer.toIntArray()
    }
}