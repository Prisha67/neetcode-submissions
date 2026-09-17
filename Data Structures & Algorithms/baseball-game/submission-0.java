class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> sc = new Stack<>();
        int sum = 0 ;
        for(int i =0 ; i < operations.length ; i ++){
            if (operations[i].equals("D")){
                int n = sc.peek();
                sc.push(2*n);
            }else if (operations[i].equals("C")){
                sc.pop();
            }else if (operations[i].equals("+")){
                int a = sc.pop();
                int b = sc.peek();
                int num = a + b;
                sc.push(a);
                sc.push(num);
            }else{
                sc.push(Integer.parseInt(operations[i]));
            }
        }

        for(int x : sc){
            sum+=x;
        }

        return sum;
    }
}