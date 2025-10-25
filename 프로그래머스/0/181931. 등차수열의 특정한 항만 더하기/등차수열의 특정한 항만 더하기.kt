class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer = 0
        for(idx in included.indices){
            if(included[idx]){
                answer += a + (d * idx)
            }
        }
        return answer
    }
}