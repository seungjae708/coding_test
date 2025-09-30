class Solution {
    fun solution(s: String): Int {
        var totalSplits = 0
        var index = 0
        
        while (index < s.length) {
            val x = s[index]
            var xCount = 1
            var otherCount = 0
            
            totalSplits++
            
            for(i in index + 1 until s.length) {
                val current = s[i]
                
                if (current==x) {
                    xCount++
                }else otherCount++
                
                if (xCount==otherCount){
                    index=i+1
                    break
                }
            }
            
            if (xCount != otherCount && index<s.length){
                index = s.length
            }
        }
        return totalSplits
    }
}