class Solution {
    fun solution(num_list: IntArray): Int {
        var gob = 1
        var hab = 0
        for (i in num_list){
            gob *=i
        }
        for (i in num_list){
            hab +=i
        }
        return if (gob <hab*hab) 1 else 0
    }
}