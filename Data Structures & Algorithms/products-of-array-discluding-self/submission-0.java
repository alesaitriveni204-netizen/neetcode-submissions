class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             int res=1;
            for(int j=0;j<nums.length;j++){
               
                if(i!=j){
                    res=res*nums[j];
                }
                
            }
            l[i]=res;
        }
        return l;
    }
}  
