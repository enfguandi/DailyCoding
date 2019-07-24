package com.company.Day007;


import java.util.ArrayList;

public class Day007 {
    protected final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private ArrayList<String> decodedMessage = new ArrayList<>();
    private int decodeCounter = 0;

    public void day007(){
        System.out.println("Start Day007!");

        String message = "Test".toLowerCase();
        String[] splittedMessage = message.split("");
        String code = "";


        for (int i = 0; i<message.length();i++){
            char c = splittedMessage[i].charAt(0);
            System.out.println("Zeichen " + c + " ist Nummer " + numberInAplhabet(c));
            code = code + numberInAplhabet(c);
            System.out.println(code);
        }

        decode(code);

        for (String letter:decodedMessage) {
            System.out.print(letter);
        }
        System.out.println();
        System.out.println(decodeCounter);
    }

    private int numberInAplhabet(char c) {
        return alphabet.indexOf(c)+1;
    }

    private char letterAtPositionInAlphabet(int position){
        return alphabet.charAt(position-1);
    }

    private void addToDecodedMessage(char letter){
        decodedMessage.add(Character.toString(letter));
    }

    private void decode(String code) {
        String[] splittedCode = code.split("");
        char letter;
        int twoNumbers;

        for (int i=0; i<code.length();i++){
            int number = Integer.parseInt(splittedCode[i]);

            if (number>0){
                letter = letterAtPositionInAlphabet(number);
                addToDecodedMessage(letter);

                String stringOfNumbers = splittedCode[i] + splittedCode[i+1];
                twoNumbers = Integer.parseInt(stringOfNumbers);
                decodeCounter++;

                if (twoNumbers > 0 && twoNumbers < 27){
                    letter = letterAtPositionInAlphabet(twoNumbers);
                    addToDecodedMessage(letter);
                    decodeCounter++;
                }
            }
        }
    }

    public String problem(){
        return "Good morning! Here's your coding interview problem for today.\n"
            + "\n"
            + "This problem was asked by Facebook.\n"
            + "\n"
            + "Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.\n"
            + "\n"
            + "For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.\n"
            + "\n"
            + "You can assume that the messages are decodable. For example, '001' is not allowed.";
    }
}
