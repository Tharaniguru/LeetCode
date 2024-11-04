class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String ans="";
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            ans = c+ans;
        }
        System.out.print(ans);
        if(ans.equals(s))
            return true;
        else
        return false;
    }
}