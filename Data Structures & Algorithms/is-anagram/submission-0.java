class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        Map<String , int[]> collection = new HashMap();
        int[] map = new int[26];
        for (char c : s.toCharArray()){
            map[c-'a']++;
        }
        collection.put(s , map);
        int[] map1 = new int[26];
        for (char c : t.toCharArray()){
            map1[c-'a']++;
        }
        collection.put(t , map1);
        if (Arrays.equals(collection.get(s), collection.get(t))){
            return true;
        }else{
            return false;
        }
        
    }
}
