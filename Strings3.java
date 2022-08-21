public class Strings3 {
    //shortest distance
    public static float getShortestDist(String str){
        int n = str.length();
        int x=0 , y=0;
        for(int i=0; i<n; i++){
            //move north 
            if(str.charAt(i) == 'N'){
              y++;
            }
            //south
            else if(str.charAt(i) == 'S'){
                y--;
        }
        //east
       else if(str.charAt(i) == 'E'){
            x++;
    }
    //west
    else{
        x--;
    }
   } 
    float X2 = x*x;
    float Y2 = y*y;
    return (float)Math.sqrt(X2 + Y2);


    }
   
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestDist(str)); 
    }
}