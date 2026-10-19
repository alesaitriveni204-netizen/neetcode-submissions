class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String str:strs){
            int l=str.length();
            s.append(l).append('#').append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int n=str.length();
        int i=0;
        while(i<n){
            int hashIndex=str.indexOf('#', i);
            int len=Integer.parseInt(str.substring(i, hashIndex));
            list.add(str.substring(hashIndex+1, hashIndex+1+len));
            i=hashIndex+1+len;
        }
        return list;
    }
}