class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer , Integer> checker = new HashMap<>() ; //the map is to arrange the nums array with its position 
        for (int i =0 ; i< nums.length; i++){
            int complement = target - nums[i] ;
            if (checker.containsKey(complement)){
                return new int[] {checker.get(complement),i};
            }
            checker.put(nums[i],i);
        }
        return new int[]{};
    }
}
