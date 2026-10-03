class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int reachmax = 0;
        int currentmax = 0;
        for(int i=0;i<nums.length-1;i++){
            reachmax = Math.max(reachmax,i+nums[i]);
            if(i==currentmax){
                jump++;
                currentmax = reachmax;
            }
           
        }
         return jump;
    }
}