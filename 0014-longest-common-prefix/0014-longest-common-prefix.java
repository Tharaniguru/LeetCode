class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb =new StringBuilder("");
        int minlen=Integer.MAX_VALUE;
        int n=strs.length;
        int i,j;
        String s=strs[0];
        int strlen=s.length();
        for(i=0;i<strlen;i++){
            char c=s.charAt(i);
            for(j=1;j<n;j++){
                if(strs[j].charAt(i)!=c){
                    break;
                }
            }
            if(j==n){
                sb.append(c);
            }
            else{
                break;
            }
        }
        String ans= sb.toString();
        return ans;
    }
}