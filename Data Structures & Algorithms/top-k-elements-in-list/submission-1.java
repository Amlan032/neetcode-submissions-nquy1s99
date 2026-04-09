class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i=0;i<n;i++){
            hMap.put(nums[i], hMap.getOrDefault(nums[i], 0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hMap.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b) -> b[0]-a[0]); // sorts in descending order by value
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
