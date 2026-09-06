class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet();
        for (int i : nums){
            uniq.add(i);
        }
        if (nums.length == uniq.size()){
            return false;
        }else{
            return true;
        }
    }
}