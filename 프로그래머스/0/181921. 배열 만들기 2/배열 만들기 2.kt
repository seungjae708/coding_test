class Solution {
    fun solution(l: Int, r: Int): IntArray {
        val resultList = mutableListOf<Int>()
        val queue = ArrayDeque<Long>()

        queue.add(5L)

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            if (current <= r && current >= l) {
                resultList.add(current.toInt())
            }

            val next0 = current * 10 
            if (next0 <= r) {
                queue.add(next0)
            }

            val next5 = current * 10 + 5
            if (next5 <= r) {
                queue.add(next5)
            }
        }

        return if (resultList.isEmpty()) intArrayOf(-1) else resultList.toIntArray()
    }
}