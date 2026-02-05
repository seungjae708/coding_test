class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        return my_strings.mapIndexed { i, str ->
            val (s, e) = parts[i]
            str.substring(s, e + 1)
        }.joinToString("")
    }
}