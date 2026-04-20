class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0){
            return 0;
        }

        int[] maxLeft= new int[n];
        int[] maxRight= new int[n];

        int max=0;
        maxLeft[0]=height[0];
        for(int i=1;i<maxLeft.length;i++){
            maxLeft[i]= Math.max(max,height[i-1]);
            max=maxLeft[i];
        }
        
         max=0;
        maxRight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i]= Math.max(max,height[i+1]);
            max=maxRight[i];
        }

        int res=0;
        for(int i=0;i<n;i++){
            if(Math.min(maxLeft[i],maxRight[i]) - height[i]>=0)
            res+= Math.min(maxLeft[i],maxRight[i]) - height[i];
        }
        return res;
    }
}
