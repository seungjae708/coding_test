class Solution {
    fun solution(word: String): Int {
        val vowels = "AEIOU"
        val weights = intArrayOf(781, 156, 31, 6, 1)
        var answer = 0
        
        for(i in word.indices) {
            val char = word[i]
            
            val vowelIndex = vowels.indexOf(char)
            answer += vowelIndex * weights[i]
            answer += 1
        }
        
        return answer
    }
}