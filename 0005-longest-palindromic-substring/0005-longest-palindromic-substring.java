class Solution {
    public String longestPalindrome(String s) {
        if(s==null ||s.length()<0)return "";
       int start=0;
    int max=1;
    for(int i=0;i<s.length();i++)
    {
        int len1=calc(s,i,i);
        int len2=calc(s,i,i+1);
        int len=Math.max(len1,len2);

        if(len>max)
        {
            max=len;
            start=i-(len-1)/2;
        }

    }
    return s.substring(start,start+max);
             
    }
    public static int calc(String s,int left,int right )
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}