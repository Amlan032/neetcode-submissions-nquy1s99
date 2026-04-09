class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int n = nums.length;
        int z = 0, max;
        for(int i=0;i<n;i++){
            if(hMap.containsKey(nums[i])){
                z = hMap.get(nums[i])+1;
                hMap.put(nums[i],z);
            }
            else{
                hMap.put(nums[i],1);
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            max = 0;
            for(Integer x : hMap.keySet()){
                if(hMap.get(x) > max){
                    z = x;
                    max = hMap.get(x);
                }
            }
            res[i] = z;
            hMap.remove(z);
        }
        return res;
    }
}
