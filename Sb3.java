public class Sb3 {
    // instead of 'aaabbbccd' write 'a3b3c2d' to save space...this is called string compression.
     public static String compress(String str){
        StringBuilder sb = new StringBuilder ("");
        for(int i=0; i< str.length(); i++){
            Integer count=1;   //it represent that there is that character present in the string
            while(i<(str.length())-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            } 
            sb.append(str.charAt(i));
            if (count >1){
                sb.append(count.toString());

            }       
        } return sb.toString();
         }
         public static void main(String[] args) {
            String str = "aaabbbccd";
            System.out.print(compress(str));
         }
}
