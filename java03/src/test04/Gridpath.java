package test04;

import javax.xml.stream.Location;

public class Gridpath {
    private final int row=0;
    private final int col=0;
    private int [][] grid;

    public Gridpath(int row, int col){

    }
    public static void main(String[] args){
        int[][] location={
                {12, 3, 4, 13, 5},
                {11, 21, 2, 14, 16},
                {7, 8, 9, 15, 6},
                {10, 17, 20, 19, 1},
                {18, 22, 30, 25, 6}
        };
        //1.komşu
        int target = location[0][0];
        int te = location[0][1];
        int ts = location[1][0];
        int n1;
        if(te < ts){
            n1= te;
        } else{
            n1= ts;
        }
        System.out.println("neighbor1: "+n1);
        //2. komşu
        int target2 = location[0][1];
        int te2 = location[0][2];
        int ts2 = location[1][1];
        int n2;
        if(te2 < ts2){
            n2= te2;
        } else{
            n2=ts2;
        }
        System.out.println("neighbor2: "+n2);
    }
    public Location getNextLoc(int row, int col){
        String neighbor;

        return null;
    }


}
