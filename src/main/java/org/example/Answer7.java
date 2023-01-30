package org.example;

public class Answer7 {
    public void isLeapYear(int year){
        if(String.valueOf(year).length() == 4 && (year%100)%4 == 0){
            System.out.println("It is a Leap year");
        }else {
            System.out.println("It is not a Leap year");
        }
    }
}
