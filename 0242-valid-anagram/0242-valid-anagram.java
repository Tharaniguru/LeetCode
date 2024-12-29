class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character ,Integer> hash1 = new HashMap <>();
        int n1=s.length();
        int n2=t.length();
        if(n1==n2){
            char []s1=s.toCharArray();
            char []s2=t.toCharArray();
            for(int i=0;i<n1;i++)
            {
                if(hash1.containsKey(s1[i]))
                {
                    hash1.put(s1[i],hash1.get(s1[i])+1);
                }
                else{
                    hash1.put(s1[i],1);
                }
            }
            for(int j=0;j<n2;j++){
                if(hash1.containsKey(s2[j])){
                    hash1.put(s2[j],hash1.get(s2[j])-1);
                }
                else{
                    hash1.put(s2[j],1);
                }
            }
            for(int a : hash1.values()){
                if(a!=0){
                    return false;
                }
            }
            return true;
           
        }
        return false;
    }
}