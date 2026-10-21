class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int c=0;
        int[] maxcount=new int[nums.length];
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            
            if(i!=nums.length-1&&nums[i]==nums[i+1]){
                continue;}
            if(i!=nums.length-1&&nums[i]+1==nums[i+1]){
                count++;
            }else{
                maxcount[c]=count;
                c++;
                count=1;
            }
        }
        int max = maxcount[0];

        for (int i = 1; i < maxcount.length; i++) {
            if (maxcount[i] > max) {
                max = maxcount[i];
            }
        }

        return max;
    }
}
