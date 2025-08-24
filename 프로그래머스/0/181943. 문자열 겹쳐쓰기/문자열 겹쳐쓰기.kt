class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        val prefix = my_string.substring(0, s)
        val endIndex = s + overwrite_string.length
        val suffix = my_string.substring(endIndex)

        return prefix + overwrite_string + suffix
    }
}