class Solution {
    public boolean hasDuplicate(int[] nums) {

        
        HashSet<Integer> tony = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(tony.contains(nums[i])) return true;

            tony.add(nums[i]);
        }
        return false;
    }
}