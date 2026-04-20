class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int total=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count ++;
                continue;
            }
            if(count !=2){
                total=total*nums[i];
            }else{
                total=0;
                break;
            }
        }
        if(count>=2){
            total=0;
        }
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0 && count==0){
            nums[i]=total/nums[i];
           }else if (nums[i]!=0 && count==1){
            nums[i]=0;
           }else{
            nums[i]=total;
           }
            
        }
        return nums;
        
    }
}  
