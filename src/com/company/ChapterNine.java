package com.company;

import java.util.Locale;

public class ChapterNine {
    //chapter 9 for strings
    public static void main (String[] args) {
        String courseName = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";

        /*concatenate strings
        String fullMessage = message + courseName;
        System.out.println(fullMessage);

        String fullMessage2 = String.format("%s%s", message, courseName);
        System.out.println(fullMessage2);

        System.out.println(courseName.charAt(0));
        System.out.println(courseName.charAt(6));
        for(int i= 15; i < 23; i++){
            System.out.print(courseName.charAt(i));
        }
        System.out.println(); */
        int position;
        position = indexOfIgnoreCase(courseName, " j");
        System.out.println(position);

        String first = "This is a string";
        String second = new String ("This is a string");
        System.out.println(first == second);
        System.out.println(second == first);
        System.out.println(first.equals(second));
        System.out.println(second.equals(first));

        StringBuilder firstStringBuilder = new StringBuilder("This is a String");
        StringBuilder secondStringBuilder = new StringBuilder("This is a string");
        String firstString = firstStringBuilder.toString();
        String secondString = secondStringBuilder.toString();
        System.out.printf("first: %s%n", firstString);
        System.out.printf("second: %s%n", secondString);
        System.out.printf("First is the same as second: %s%n", firstString == secondString);
        System.out.printf("First.equals(second): %s%n", firstString.equals(secondString));
    }
private static int indexOfIgnoreCase(String text, String searchText){
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase);
}
}
