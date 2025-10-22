class Solution {
    fun solution(num_list: IntArray): IntArray {
        val new = if (num_list[num_list.size-1] > num_list[num_list.size-2]){
            num_list[num_list.size-1] - num_list[num_list.size-2]
        } else {
            num_list[num_list.size-1]*2
        }

        return num_list.plus(new)
    }
}