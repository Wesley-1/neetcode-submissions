class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        
        var maximumOnes = 0
        var result = 0

        nums.forEach {
            if (it == 1) maximumOnes += 1
            else { 
                maximumOnes = 0
            }
            result = Math.max(result, maximumOnes)
        }

        return result
    }
}
