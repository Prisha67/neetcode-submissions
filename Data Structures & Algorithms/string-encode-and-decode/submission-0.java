class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0){
            return Character.toString((char)257);
        }

        String separater = Character.toString((char)258);
        StringBuilder sb = new StringBuilder ();

        for (String s : strs){
            sb.append(s);
            sb.append(separater);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.equals(Character.toString((char)257))){
            return new ArrayList<String>();
        }

        String separator = Character.toString((char)258);
        String[] parts = str.split(separator, -1);
        List<String> res = new ArrayList<>(Arrays.asList(parts));
        res.remove(res.size() - 1);
        return res;
    }
}