class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toLowerCase().toCharArray();
        int left = 0;
        int right = str.length - 1;

        while (left <= right) {
            if (!Character.isLetterOrDigit(str[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(str[right])) {
                right--;
            } else {
                if (str[left] != str[right]) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }

        return true;
    }
}
