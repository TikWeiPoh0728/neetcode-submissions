class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if(i == 0){
                
            }
            else if(nums[i-1] == nums[i]){
                return true;
            }
        }
        return false;
    }
}