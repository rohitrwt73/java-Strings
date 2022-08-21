public class Substring1 {
    //substring is a continuous part in string.
    //subsequence is also a part of string which is not in continuous manner.
    //in qs we will be given a string and the starting index and ending index of substring ...print substring.
    public static String substring(String str, int si, int ei){
      String substr = "";
      for(int i = si; i<ei; i++){  //ei is not included
        substr+= str.charAt(i);
      }
      return substr;
    }
   
    public static void main(String[] args) {
        String str= "HelloWorld";
         //java has inbuilt function for substring.
         System.out.print(str.substring(0,5));
         
       // System.out.print(substring(str,0,5));

    }
}
