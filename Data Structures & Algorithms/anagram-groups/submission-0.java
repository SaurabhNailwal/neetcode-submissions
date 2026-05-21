class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> anagramGrpList = new ArrayList();

        for(int i=0; i < strs.length; i++){

            String word = strs[i];
            Boolean found = false;
            
            for(int j=0; j< anagramGrpList.size(); j++){

                if(isAnagram(anagramGrpList.get(j).get(0),word)){
                    anagramGrpList.get(j).add(word);
                    found=true;
                    break;
                }
            }

            if(!found){
                //add if reached here
                anagramGrpList.add(new ArrayList<>(Arrays.asList(word)));
            }

        }

        return anagramGrpList;
        
    }

    //method to check anagram
    private boolean isAnagram(String word1, String word2){

        if(word1.length() != word2.length()){
            return false;
        }

        char[] w1Arr = word1.toCharArray();
        char[] w2Arr = word2.toCharArray();

        Arrays.sort(w1Arr);
        Arrays.sort(w2Arr);

        for(int i=0; i< w1Arr.length; i++){
            if(w1Arr[i] != w2Arr[i]){
                return false;
            }
        }

        return true;

    }
}
