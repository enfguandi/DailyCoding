package com.company.Day001;

public class Day001 {
    public void day001(){
        System.out.println("Start Day001");
        int[] x = new int[5];
        int k = 17;
        int hit = 0;

        x[0] = 10;
        x[1] = 15;
        x[2] = 3;
        x[3] = 7;

        for(int y : x){
            for(int z : x){
                if(y + z == k){
                    hit++;
                    System.out.println(y + " + " + z + " = " + k);
                }
            }
        }
        System.out.println("Hits: " + hit);
        System.out.println("Finish Day001!!!");
    }

    public String problem(){
        String p = "This problem was recently asked by Google.\n"
            + "\n"
            + "Given a list of numbers and a number k, return whether any two numbers from the list add up to k.\n"
            + "\n"
            + "For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.\n"
            + "\n"
            + "Bonus: Can you do this in one pass?";

        return p;
    }
}
