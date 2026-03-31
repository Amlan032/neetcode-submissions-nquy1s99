class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        int maxLength = 0;
        HashSet<Character> hSet = new HashSet<>();
        while(l<=r && r<n){
            if(!hSet.contains(s.charAt(r))){
                maxLength = Math.max(maxLength, r-l+1);
                hSet.add(s.charAt(r));
                r++;
            }
            else{
                while(hSet.contains(s.charAt(r))){
                    hSet.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return maxLength;
    }
}
