public class Solution {
    public String reverseWords(String s) {
        String res="";
        String[] input =s.trim().split("\\s+");// \means escape,\s means space,+means one or more times
        for(int i=input.length-1;i>0;i--){
            res+=input[i]+" ";
        }
        return res+input[0];
    }
}
