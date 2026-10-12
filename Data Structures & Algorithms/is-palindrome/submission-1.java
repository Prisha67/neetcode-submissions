class Solution {
    public boolean isPalindrome(String s) {
        String parts[] = s.split(" ");

        StringBuilder sc = new StringBuilder();

        for (String x : parts){
            x = x.toLowerCase();
            x = x.replaceAll("[^a-zA-Z0-9 ]", "").strip();

            sc.append(x);
        }

        int len = sc.length();

        int l = 0, r = len - 1;

        while(l<=r){
            if (sc.charAt(l) == sc.charAt(r)){
                
                l++;
                r--;
            }else{
                return false;
            }
            
        }

        return true;

    }
}
