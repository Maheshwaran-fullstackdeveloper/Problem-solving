class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int lenf = (len1 + len2) / 2 ;
        int[] arr = new int[lenf+1];
        int left = 0;
        int right = 0;
        int cnt =0 ;
        while(cnt<=lenf && left<len1 && right<len2 )
        {
            if(nums1[left]<nums2[right])
            {
                arr[cnt++] = nums1[left++];
            }else{
                arr[cnt++] = nums2[right++];
            }
        }
        while(cnt<=lenf && left<len1)
        {
            arr[cnt++] = nums1[left++];
        }
        
        while(cnt<=lenf && right<len2)
        {
            arr[cnt++] = nums2[right++];
        }
        if((len1+len2)%2==0)
        {
            return (arr[lenf]+arr[lenf-1])/(double)2;
        }
        return (double)arr[lenf];
    }
}