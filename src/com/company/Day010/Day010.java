package com.company.Day010;

import java.util.concurrent.TimeUnit;

public class Day010 {
    public void day010(){
        System.out.println("Start Day010!!!");

        int countUntil = 25;
        int wait = 10;

        System.out.println("Count until " + countUntil);
        System.out.println("Time to wait: " + wait);
        try {
            TimeUnit.SECONDS.sleep(wait);
        }catch (Exception e){
            System.out.println("Shit happens!");
        }

        counter(countUntil);

    }

    private void counter(int countUntil){
        for (int i=1;i==countUntil; i++){
            System.out.println(i);
        }
    }
}
