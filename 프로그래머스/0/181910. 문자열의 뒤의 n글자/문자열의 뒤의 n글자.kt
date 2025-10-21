class Solution {
    fun solution(my_string: String, n: Int): String {
        val length = my_string.length
        return my_string.substring(length-n)
    }
}