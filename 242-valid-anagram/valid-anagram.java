class Solution {
    public boolean isAnagram(String s, String t) {
        int count=0;       
        if (s.length()!=t.length()){
            return false;
        }
        char[] chars1=s.toCharArray();
        char[] chars2=t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        int result = Arrays.compare(chars1, chars2);
        if(result==0){
            return true;
        }

        return false;
    }
}