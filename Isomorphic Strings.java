public class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s.length()==0 ||s.length()==1 ||s.equals(t)){
         return true;
     }
    
     HashMap<Character,Character> map= new HashMap<Character,Character>();
     map.put(s.charAt(0),t.charAt(0));
     for(int i=1;i<s.length();i++){
         if(map.containsKey(s.charAt(i))){
             if(map.get(s.charAt(i))!=t.charAt(i)){
                 return false;
             }
         }
         else{
             if(map.containsValue(t.charAt(i))){
                 return false;
             }
         }
        map.put(s.charAt(i),t.charAt(i));
          
     }
     return true;
    }
}
