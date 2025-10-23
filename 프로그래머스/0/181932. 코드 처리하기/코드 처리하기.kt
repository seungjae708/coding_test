class Solution {
    fun solution(code: String): String {
        var mode = 0
        var result = ""
        
        for( idx in code.indices) {
            
            if(mode == 0){
                if(code[idx] != '1') {
                    if(idx%2 == 0) {
                        result += code[idx]
                    }
                } else {
                    mode = 1 
                }             
            }
            else {
                if(code[idx] != '1') {
                    if (idx %2 != 0) {
                        result += code[idx]
                    } 
                } else {
                    mode = 0 
                }       
            }
            
        }
        return if (result.isEmpty()) "EMPTY" else result
        
    }
}