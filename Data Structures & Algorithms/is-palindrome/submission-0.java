class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder s1=new StringBuilder(s);
        String s2=s1.reverse().toString();
        if(s.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}
