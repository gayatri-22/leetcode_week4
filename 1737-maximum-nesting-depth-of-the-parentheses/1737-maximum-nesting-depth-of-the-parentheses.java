class Solution {
    public int maxDepth(String s) {
        /*int maxCounter= 0;
        int counter=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                counter++;
            }
            else if(s.charAt(i)==')'){
                counter--;
            }
            else{
                continue;
            }
            maxCounter= Math.max(counter,maxCounter);
        }
        return maxCounter;*/

        Stack<String> stk = new Stack<>();
        int max =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                 stk.push("(");
                 if(stk.size()>max)
                    max = stk.size();
            }
            else if(s.charAt(i) == ')'){
                stk.pop();
            }
        }
        return max;
    }
}