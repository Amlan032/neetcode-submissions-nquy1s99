class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hMap = new HashMap<>();
        int n = strs.length;
        String str;
        List<String> lStr;
        for(int i=0;i<n;i++){
            str = sortedString(strs[i]);
            if(hMap.containsKey(str)){
                lStr = hMap.get(str);
                lStr.add(strs[i]);
                hMap.put(str, lStr);
            }
            else{
                hMap.put(str, new ArrayList<String>(Arrays.asList(strs[i])));
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String s : hMap.keySet()){
            res.add(hMap.get(s));
        }
        return res;
    }

    private String sortedString(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
