package com.company.app;

import com.company.Day001.Day001;
import com.company.Day005.Day005;

public class Main {

    public static void main(String[] args) {
        Day001 day001 = new Day001();
        System.out.println(day001.problem());
        day001.day001();

        Day005 day005 = new Day005();
        System.out.println(day005.problem());
        day005.day005();
    }
}