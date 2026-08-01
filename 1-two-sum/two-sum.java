class Solution {
    public int[] twoSum(int[] nums, int target) {
          for(int i=1;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int x=j-i;
                if(nums[x]+nums[j]==target)
                {
                    return new int[] {x,j};
                }
                
    }

}
return new int[0];
    }
}