class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int[] l=new int[k]; 
        int c=0;
        for(int num : h.keySet()){
            if(h.get(num)>=k){
                l[c]=num;
                c++;
            }
        }
        return l;
    }
}
