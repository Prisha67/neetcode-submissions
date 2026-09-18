class Solution {
    public boolean isValid(String s) {
        Stack <Character> sc = new Stack<>();
        int num = s.length();
        if (num%2!= 0){return false;}
        for (int i =0 ; i < num ; i++){
            char cur = s.charAt(i);
            if (cur=='('||cur=='['||cur=='{'){
                sc.push(cur);
            }else{
                if (sc.isEmpty()){return false;}
                if (cur ==')' && sc.peek()=='(') {sc.pop();continue;}
                else if (cur =='}' && sc.peek()=='{') {sc.pop();continue;}
                else if (cur ==']' && sc.peek()=='[') {sc.pop();continue;}
                else{return false;}
            }
        }
        if (!sc.isEmpty()){return false;}
        return true;
    }
}
