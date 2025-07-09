class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int i;
        Map<Character , Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        for(i=0;i<s.length()-1;i++){
            char per= s.charAt(i);
            char next=s.charAt(i+1);
            if(roman.get(per) < roman.get(next) ){
                ans-=roman.get(per);
            }
            else{
                ans+=roman.get(per);
            }
        }
        ans+=roman.get(s.charAt(i));
        return ans;
    }
}