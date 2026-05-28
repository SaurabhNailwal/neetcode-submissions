class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        String reverse = new StringBuilder(s).reverse().toString();

        if(s.equalsIgnoreCase(reverse)){
            return true;
        }

        return false;
        
    }

}
