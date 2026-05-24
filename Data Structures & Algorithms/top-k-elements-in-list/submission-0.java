class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // maintain a hashmap and the sort it by values(count)
        Map<Integer, Integer> countMap = new HashMap();

        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        List<int[]> elementList = new ArrayList();
        for(Map.Entry<Integer,Integer > entry: countMap.entrySet()){
            elementList.add(new int[]{entry.getValue(), entry.getKey()});
        }

        elementList.sort((a,b) -> b[0] - a[0]);

        int[] result = new int[k];
        for(int i=0;i < k; i++){
            result[i] = elementList.get(i)[1];
        }

        return result;
        
    }
}
