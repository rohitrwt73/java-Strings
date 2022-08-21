public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); //Stringbuilder is mutable unless string
        for(char ch ='a'; ch<='z'; ch++ ){
            sb.append(ch); //.append is used so that from now any value of ch will be added after the initiated value of sb i.e. "" here
        } System.out.print(sb);
    }
}
