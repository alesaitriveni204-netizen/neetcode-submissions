class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(h.containsKey(key)){
                h.get(key).add(strs[i]);
            }else{
            h.put(key, new ArrayList<>());
            h.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(h.values());
    }
}