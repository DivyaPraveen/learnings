package com.example.demo_int;

//Write a program to print the index of the first non repeated character in a java string
public class BuggyBread1{
public static void main (String[] args) {
   String str = "hheello world";
   char[] charArray = str.toCharArray();
   char selectedChar = 'a';
   for(char char1: charArray){
      if(!str.contains(Character.toString(char1).concat(Character.toString(char1)))){
         selectedChar = char1;
         break;
      }
   }
   System.out.println(str.indexOf(Character.toString(selectedChar)));
}
}