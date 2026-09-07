class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        int count[] = new int[26] ;
        Arrays.fill(count , 0 );
        for(char x : s.toCharArray()){
            count[x-'a']++;
        }

        for (char i: t.toCharArray()){
            count[i-'a']--;

            if (count[i-'a']<0){
                return false;
            }
        }

        return true;

    }
}
