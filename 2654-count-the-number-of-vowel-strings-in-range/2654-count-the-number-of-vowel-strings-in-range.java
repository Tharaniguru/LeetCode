
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int n=words.length;
        int count=0;
        char []arr={'a','e','i','o','u'};
        for(int i=left;i<=right;i++){
            String s=words[i];
            char one=s.charAt(0);
            int l=s.length();
            char last=s.charAt(l-1);
            if(isVowel(one)&& isVowel(last)){
                count++;
            }

        }
        return count;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}