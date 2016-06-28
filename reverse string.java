// use stringBuilder
public class Solution {
    public String reverseString(String s) {
        
        StringBuilder rst=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            rst.append(s.charAt(i));
        }
        return rst.toString();
    }
}

//recursion, works but take a lot memory
public class Solution {
    public String reverseString(String s) {
       
       if(s.length()<=1){
           return s;
       } 
       else{
           return reverseString(s.substring(1))+s.substring(0,1);
       }
       
    }
}
