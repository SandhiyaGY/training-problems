//LEETCODE:1930
class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String> set=new HashSet<>();
        int[] right=new int[26];
        int[] left=new int[26];
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            right[index]++;
        }
        int firstIndex=s.charAt(0)-'a';
        left[firstIndex]++;
        right[firstIndex]--;
        for(int i=1;i<s.length()-1;i++){
            char middle=s.charAt(i);
            right[middle-'a']--;
            for(int j='a';j<='z';j++){
                int index=j-'a';
                if(right[index]!=0&& left[index]!=0){
                    StringBuilder sb=new StringBuilder();
                    sb.append((char)j).append(middle).append((char)j);
                    set.add(sb.toString());
                }
            }
            left[middle-'a']++;
        }
        return set.size();
    }
}
