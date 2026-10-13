class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            if(h.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}