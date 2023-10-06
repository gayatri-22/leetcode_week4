class Solution {
    public boolean isAnagram(String s, String t) {
       /* if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> cS = new HashMap<>();
        HashMap<Character,Integer> cT= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(cS.containsKey(s.charAt(i))){
                cS.put(s.charAt(i),cS.get(s.charAt(i))+1);
            }
            else{
                cS.put(s.charAt(i),1);
            }
        }
        for(int j=0;j<t.length();j++){
            if(cT.containsKey(t.charAt(j))){
                cT.put(t.charAt(j),cT.get(t.charAt(j))+1);
            } 
            else{
                cT.put(t.charAt(j),1);
            } 
        }
         if(cS.equals(cT)){
             return true;
         }
         return false;*/

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}