public class Solution {
    public char findTheDifference(String s, String t) {
        char rst=t.charAt(t.length()-1);
        for(int i=0;i<s.length();i++){
            rst^=s.charAt(i);
            rst^=t.charAt(i);
        }
        return rst;
    }
}
