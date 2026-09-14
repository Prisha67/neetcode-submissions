class Solution {
    public int removeElement(int[] nums, int val) {
        List <Integer> arr = new ArrayList<> ();
        int size = nums.length;
        for (int i = 0 ; i < size ; i ++){
            if (nums[i]!=val){
                arr.add(nums[i]);
            }
        }
        int s = arr.size();
        for (int i = 0 ; i < s ; i++){
            nums[i] = arr.get(i);
        }
        return s;

        
    }
}