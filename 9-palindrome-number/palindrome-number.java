class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String value = Integer.toString(x);
        String result = "";
        for(int i = value.length(); i > 0; i--) {
            result += value.charAt(i - 1);
        }
        return result.equals(value);
    }
}