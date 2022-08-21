public class Strings5 {
    //new fn in java ... i) str1 compareTo(str2) -->case sensitive
              //      ii) str1 comparetoIgnoreCase(str2)-->  this is not case sensitive means'a' = 'A'.
     public static void main(String args[]){ //find largest string in lexicographic order
        String fruits []= { "Mango","Apple", "Banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareToIgnoreCase (fruits[i]) < 0){
                largest = fruits[i];
            }
        }System.out.println(largest);
     }
}
