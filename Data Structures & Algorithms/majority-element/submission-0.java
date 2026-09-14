class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<> ();
        int size = nums.length;
        for (int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
            if (map.get(num)>(size/2)){
                return num;
            }
        }
        return -1;
    }
}