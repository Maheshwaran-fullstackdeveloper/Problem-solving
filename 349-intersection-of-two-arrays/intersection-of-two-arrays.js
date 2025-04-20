/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    const num1 = new Set(nums1);
    const num2 = new Set(nums2);
    let result = []
    for(num of num1) {
        if(num2.has(num)) {
            result.push(num)
        }
    }
    return result
};