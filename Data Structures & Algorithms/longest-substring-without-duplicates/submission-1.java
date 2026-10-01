class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int max = 0;
        HashSet <Character> set = new HashSet<> ();

        for (int right = 0 ; right < s.length() ; right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max , right - left + 1);
        }


    return max;

    // brute force method .
    /*
    int len  = s.length();
    int prev_size = 0 ;

    for (int i = 0 ; i < len ; i ++){
       
        List<Character> str = new ArrayList<>();
         str.add(s.charAt(i));
        for (int j = i + 1 ; j < len ; j++){
            if (!str.contains(s.charAt(j))){
                str.add(s.charAt(j));
            }else{
                if (str.size() > prev_size){
                    prev_size = str.size();
                }
                break;
            }
        }
    }

    return prev_size;
    */
}
}
