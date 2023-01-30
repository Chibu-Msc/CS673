package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Answers to Questions 2 to 7:");
        System.out.println("Question 2:");
        Answer2 answer2 = new Answer2();
        answer2.print();

        System.out.println("\nQuestion 3:");
        Answer3 answer3 = new Answer3();
        answer3.multiplicationTable();

        System.out.println("\nQuestion 4:");
        Answer4 answer4 = new Answer4();
        answer4.isPalindrome("mom");

        System.out.println("\nQuestion 5:");
        Answer5 answer5 = new Answer5();
        answer5.combiningLists();

        System.out.println("\nQuestion 6:");
        Answer6 answer6 = new Answer6();
        answer6.fibonacciNumbers(100);

        System.out.println("\nQuestion 7:");
        Answer7 answer7 = new Answer7();
        answer7.isLeapYear(2020);
    }
}