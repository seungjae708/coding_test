class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach{ (s,e,k) ->
            for (i in s..e) {
                if(i % k == 0) {
                    arr[i] ++
                }
            }
        }
        return arr
    }
}