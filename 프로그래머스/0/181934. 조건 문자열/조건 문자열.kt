class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var condition = when(ineq+eq){
            ">=" -> n>=m
            "<=" -> n<=m
            ">!" -> n>m
            "<!" -> n<m
            else -> false
        }
        return if (condition) 1 else 0 
    }
}