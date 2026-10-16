class Solution {
    public int maxArea(int[] height) {
        int l=0,max=0,res=0;;
        int r=height.length-1;
        while(l<=r){
            if(height[l]>height[r])
                res=height[r]*(r-l);
            else
                res=height[l]*(r-l);
            if(max<res)
                max=res;
            if (height[l] <= height[r]) {
                    l++;
            } else {
                   r--;
                }            
        }
        return max;
    }
}