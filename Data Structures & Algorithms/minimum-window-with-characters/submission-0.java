class Solution {
    public String minWindow(String s, String t) {

        if(t.isEmpty() || t.length() > s.length()){
            return "";
        }

        // calculate hash of t 
        Map<Character, Integer> countTMap = new HashMap();
        Map<Character, Integer> windowMap = new HashMap();

        for(char c: t.toCharArray()){
            countTMap.put(c, countTMap.getOrDefault(c, 0)+1);
        }


        // Using sliding window look for smallest substring which satisfies 

        int l = 0;

        int have = 0, need = countTMap.size();
        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        for(int r = 0 ; r < s.length(); r++){

            char c = s.charAt(r);
            windowMap.put(c, windowMap.getOrDefault(c, 0)+1);

            if(countTMap.containsKey(c) && windowMap.get(c).equals(countTMap.get(c))){
                have++;
            }

            while(have == need){
                if((r-l+1) < resLen){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }

                char leftChar = s.charAt(l);

                windowMap.put(leftChar, windowMap.get(leftChar)-1);

                if(countTMap.containsKey(leftChar) &&
                    windowMap.get(leftChar) < countTMap.get(leftChar)){
                        have--;
                    }

                l++;
            }

        }
        
        return resLen == Integer.MAX_VALUE? "":s.substring(res[0], res[1]+1);
    }
}
