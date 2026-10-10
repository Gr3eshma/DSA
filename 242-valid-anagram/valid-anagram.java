class Solution {
    public boolean isAnagram(String s, String t) {
        int i=0,count=0;       
        if (s.length()==t.length()){
            char[] chars1=s.toCharArray();
            Arrays.sort(chars1);
            char[] chars2=t.toCharArray();
            Arrays.sort(chars2);
            for(i=0;i<s.length();i++){
                if (chars1[i]==chars2[i]){
                    count++;
                }
                else{
                    return false;
                }
                if(count==s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}