class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> numset = new HashSet<Integer>();
        for(int num : nums) {
            numset.add(num);
        }
        for(int i = 0; i <= nums.length; i++) {
            if(!numset.contains(i)) return i;
        }
        return -1;
    }
}