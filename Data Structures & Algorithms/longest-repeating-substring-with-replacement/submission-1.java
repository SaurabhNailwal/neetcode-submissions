class Solution {
    public int characterReplacement(String s, int k) {

        int len = s.length();

        if(len <=k ){
            return len;
        }

        int maxLen = 0;

        for(int i=0;i < len; i++){
            
            Map<Character, Integer> countMap = new HashMap<>();
            int maxf=0;

            for(int j=i; j < len; j++){
                countMap.put(s.charAt(j), countMap.getOrDefault(s.charAt(j), 0) + 1);
                maxf = Math.max(maxf, countMap.get(s.charAt(j)));
                if((j-i+1) - maxf <=k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }

        }

        return maxLen;
        
    }
}
