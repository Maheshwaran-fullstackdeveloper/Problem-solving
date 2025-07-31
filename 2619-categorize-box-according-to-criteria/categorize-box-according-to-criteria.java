class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        double f = Math.pow(10,4);
        double n = Math.pow(10, 9);
        boolean bulky = (length >= f || width >= f || height >= f) || ((long)length * width * height) >= n;
        boolean heavy = mass >= 100;
        if(bulky && heavy) {
            return "Both";
        }
        else if(!bulky && !heavy) {
            return "Neither";
        }
        else if(bulky && !heavy) {
            return "Bulky";
        }
        else if(heavy && !bulky) {
            return "Heavy";
        }
        return "-1";
    }
}