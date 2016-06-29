public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] rst=new int[26];
        
        for(int i=0;i<s.length();i++){
            rst[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            rst[t.charAt(i)-'a']--;
        }
        for(int n: rst){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
