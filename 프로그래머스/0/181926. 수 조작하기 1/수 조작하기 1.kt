class Solution {
    fun solution(n: Int, control: String): Int {
    var currentN = n

    for (char in control) {
        when (char) {
            'w' -> currentN += 1   
            's' -> currentN -= 1   
            'd' -> currentN += 10  
            'a' -> currentN -= 10  
            else -> { }
        }
    }
    return currentN
}
}