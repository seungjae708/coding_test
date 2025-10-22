class Solution {
    fun solution(num_list: IntArray): Int {
        var odd = ""
        var even = ""
        for(i in num_list){
            if(i%2 != 0){
                odd += i.toString()
            }
            else{
                even += i.toString()
            }
        }
        
        return odd.toInt() + even.toInt()
    }
}