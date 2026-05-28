class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sB = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sB.append(Character.toLowerCase(c));
            }
        } 

        int len = sB.length();

        for(int i=0; i< len/2; i++){

            if(sB.charAt(i) != sB.charAt(len-1 - i)){
                return false;
            }

        }

        return true;
        
    }

}
