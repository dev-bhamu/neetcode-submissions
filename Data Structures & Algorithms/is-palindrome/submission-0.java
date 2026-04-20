class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] c= result.toCharArray();
        int low=0;
        int high=c.length-1;

        while(low<=high){
            if(c[low]!=c[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;

    }
}
