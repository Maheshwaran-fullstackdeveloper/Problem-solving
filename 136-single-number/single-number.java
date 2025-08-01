class Solution {
    public int singleNumber(int[] nums) {
        int val = 0;
        for(int num : nums) {
            val ^= num;
        }
        return val;
    }
}