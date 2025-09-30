class Solution {
    fun solution(n: Int): Int {
        return if (n%2!=0) {
            (1..n).filter{it%2 !=0}.sum()
        }
        else {
            (1..n).filter{it%2==0}.sumOf{it*it}
        }
    }
}