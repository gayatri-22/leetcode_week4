class Solution {
    public int maxDepth(String s) {
        int maxCounter= 0;
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
        return maxCounter;
    }
}