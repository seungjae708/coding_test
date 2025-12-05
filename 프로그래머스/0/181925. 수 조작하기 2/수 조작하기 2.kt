class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = "" 
        
        for (i in 1 until numLog.size) {
            val diff = numLog[i] - numLog[i - 1]
            
            answer += when (diff) {
                1 -> "w"
                -1 -> "s"
                10 -> "d"
                -10 -> "a"
                else -> ""
            }
        }
        
        return answer
    }
}