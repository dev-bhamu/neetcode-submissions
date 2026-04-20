class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        Boolean isDUp=false;
        for(int i=0;i<nums.length;i++){
          isDUp=  dup.add(nums[i]);
          if(!isDUp) return true;
        }
        return false;
    }
}