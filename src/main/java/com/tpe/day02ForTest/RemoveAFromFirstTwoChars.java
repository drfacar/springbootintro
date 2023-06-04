package com.tpe.day02ForTest;

public class RemoveAFromFirstTwoChars {

    // task: write a method which will remove "A" from a string, if A is found in first 2 characters
    // AABD --> BD, ABC-->BC, AA --> ''
    public String removeAFromFirstTwoChars(String str){

        if(str.length()<=2){ // if the length is less than or equal to 2, we do not need to use substring()
            return str.replaceAll("A","");
        }
        String firstTwoChars = str.substring(0,2); // get first 2 characters from the string
        String charsAfterFirstTwo = str.substring(2); // get rest of characters

        return firstTwoChars.replaceAll("A","") + charsAfterFirstTwo;
    }

}
