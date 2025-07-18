class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArrays = s.toCharArray();
        char[] charArrayt = t.toCharArray();
        Arrays.sort(charArrays);
        Arrays.sort(charArrayt);
        String sorteda = new String(charArrays);
        String sortedt = new String(charArrayt);
        return sortedt.equals(sorteda);
    }
}