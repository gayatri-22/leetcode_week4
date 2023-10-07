class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
     // StringBuilder reverse = new StringBuilder(" ");
      
      String reverse="";
      for(int i=str.length-1;i>=0;i--){
         // reverse.append(str[i]+" ");
         reverse +=str[i]+" ";
      }  
      //return reverse.toString().trim(); 
       return reverse.trim() ;
    }
}