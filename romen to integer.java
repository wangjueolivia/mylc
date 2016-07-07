public class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0){
            return 0;
        }
        Map<Character,Integer> m= new HashMap<Character,Integer>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int rst=0;
        for(int i=0;i<s.length()-1;i++){
            int a=m.get(s.charAt(i));
            int b=m.get(s.charAt(i+1));
            if(a<b){
                rst-=a;
            }
            else{
                rst+=a;
            }
            
        }
        rst+=m.get(s.charAt(s.length()-1));
        return rst;
    }
}
