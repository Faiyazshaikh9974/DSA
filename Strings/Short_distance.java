package Strings;

public class Short_distance {

    //Given a route containing 4 Directions (E, W , S ,N) find the shortest path to reach the Destination...

    //formula to get shortest path = Math.sqrt(x*x + y*y)

    public static float findShortestDistance(String str){
        int x =0; int y =0;
        for(int i=0; i<str.length(); i++){
            char chr = str.charAt(i);
            if(chr == 'S'){
                y--;
            }else if( chr == 'N'){
                y++;
            }else if( chr == 'W'){
                x--;
            }else{
                x++;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {   //remeber the how to calculate the steps if W = x--  E= x++, S= y-- N y++
        String str = "WNEENESENNN";
        System.out.println(findShortestDistance(str));

    }
    
}
