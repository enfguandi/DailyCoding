package com.company.Day005;

import java.sql.SQLOutput;

public class Day005 {
    int [] pair = new int[2];
    public void day005(){
        System.out.println("Start solution Day005!");

        System.out.println(car(pairing(3,7)));
        System.out.println(cdr(pairing(3,7)));

        System.out.println("Finish Day005!");
    }

    private int[] pairing(int a, int b){
        pair[0] = a;
        pair[1] = b;
        return pair;
    }

    private int car(int[] arr){
        return arr[0];
    }

    private int cdr(int[] arr){
        return arr[pair.length-1];
    }

    public String problem(){
        String p;

        p = "This problem was asked by Jane Street.\n"
            + "\n"
            + "cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.\n"
            + "\n"
            + "Given this implementation of cons:\n"
            + "\n"
            + "def cons(a, b):\n"
            + "    def pair(f):\n"
            + "        return f(a, b)\n"
            + "    return pair\n"
            + "Implement car and cdr.";

        return p;
    }

}
