class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedSB = new StringBuilder();
   
        // length # word
        for(String str: strs){
            encodedSB.append(str.length()).append("#").append(str);
        }

        return encodedSB.toString();

    }

    public List<String> decode(String str) {

        List<String> decodeList = new ArrayList();

        //Decode with length till # and then read word till length

        int curIndex = 0;

        while(curIndex < str.length()){
            int lenIndex = curIndex;
            while(str.charAt(lenIndex)!= '#'){
                lenIndex++;
            }
            int length = Integer.parseInt(str.substring(curIndex, lenIndex));
            curIndex = lenIndex + 1;
            decodeList.add(str.substring(curIndex, curIndex+length));
            curIndex = curIndex+length;

        }

        return decodeList;

    }
}
