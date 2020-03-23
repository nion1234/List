package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>wordList=new ArrayList<>();
        wordList.add("Number 1");
        wordList.add("Number 2");
        wordList.add("number 3");
        //System.out.println(wordList.get(2));
        for(int i=0;i<wordList.size();i++){
            System.out.println(wordList);
        }
        System.out.println("----------------------------");
        for(String word:wordList){
            System.out.println(word);
        }
    }
}
