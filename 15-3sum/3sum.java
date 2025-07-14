class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);    
        List<List<Integer>> list = new ArrayList<>();
        int i,j,k,sum;
        int size = nums.length;
        for(i=0;i<size-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            j=i+1;
            k=size-1;
            while(j<k)
            {
                sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        System.gc();
        return list;  
            


    }
}