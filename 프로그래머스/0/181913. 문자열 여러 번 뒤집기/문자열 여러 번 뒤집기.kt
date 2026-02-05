class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        val sb = StringBuilder(my_string)
        queries.forEach{ (s,e) ->
            var left = s
            var right = e
            
            while(left < right) {
                sb[left] = sb[right].also{sb[right] = sb[left]}
                left ++
                right --
            }
        }
        return sb.toString()
    }
}