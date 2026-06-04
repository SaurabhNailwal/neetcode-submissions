class Solution {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        if(len < 2){
            return len;
        }

        //sliding window

        int l = 0;
        int r = l;

        Set<Character> charSet = new HashSet();
        charSet.add(s.charAt(l));

        int maxLen = 1;

        while(r < len-1){
            r++;
            if(charSet.add(s.charAt(r))){
                maxLen = Math.max(maxLen, r-l+1);
            }else{
                while(s.charAt(l) != s.charAt(r)){
                    charSet.remove(s.charAt(l));
                    l++;
                }
                l++;
            }


        }


        return maxLen;
    }
}
