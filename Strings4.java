public class Strings4 {
    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony"); //str3 will not return equal with str1 and str2 if == is used 
        if(str1 == str2 && str1.equals(str3)){      //str3 will  return equal with str1 and str2 if .equals() is used.
            System.out.println("these are equal.");

        }
        else{
            System.out.println("not equal");
        }
    }
}
