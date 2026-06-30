class Solution {
    public int jump(int[] nums) {
        int numsSize=nums.length ;
        if(numsSize<=1) 
            return 0;
        int j=0,i=0;
        int ce=0;
        int fe=0;

        for(i=0;i<numsSize;i++){
            fe=Math.max(fe,i+nums[i]);
            if(ce==i && i!=numsSize-1){
                ce=fe;
                j++;
            }
        }
        return j;
    }
    
}