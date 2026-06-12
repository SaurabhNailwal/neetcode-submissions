public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        Map<Character, Integer> countS1Map = new HashMap();
        Map<Character, Integer> countS2Map = new HashMap();

        for(int i=0; i<s1.length();i++){
            char c1 = s1.charAt(i);
            countS1Map.put(c1, countS1Map.getOrDefault(c1,0)+ 1);
            char c2 = s2.charAt(i);
            countS2Map.put(c2, countS2Map.getOrDefault(c2,0)+ 1);
        }

        int countS1 = countS1Map.size();
        int matches = 0;

        //check for matches
        for(char key:  countS1Map.keySet()){
            if(countS1Map.get(key) == countS2Map.getOrDefault(key, 0)){
                matches++;
            }
        }

        if(countS1 == matches){
            return true;
        }

        int l = 0;
        for(int r = s1.length(); r < s2.length(); r++){

            char rChar = s2.charAt(r);
            countS2Map.put(rChar, countS2Map.getOrDefault(rChar, 0) + 1);

            if(countS1Map.getOrDefault(rChar, -1) == countS2Map.get(rChar)){
                matches++;
            }else if(countS1Map.getOrDefault(rChar, -1)+1 == countS2Map.get(rChar)){
                matches--;
            }

            char lChar = s2.charAt(l);
            // Check BEFORE decrementing
            if (countS1Map.getOrDefault(lChar, -1) == countS2Map.getOrDefault(lChar, 0)) {
                matches--; // was a match, removing will break it
            }
            countS2Map.put(lChar, countS2Map.get(lChar) - 1);
            // Check AFTER decrementing
            if (countS1Map.getOrDefault(lChar, -1) == countS2Map.getOrDefault(lChar, 0)) {
                matches++; // now matches again after removal
            }
            l++;

            if(matches == countS1){
                return true;
            }


        }

        


        return false;
    }
}
