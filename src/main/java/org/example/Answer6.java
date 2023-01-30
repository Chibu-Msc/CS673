package org.example;

public class Answer6 {
    public void fibonacciNumbers(int total){
        int number1 = 1, number2 = 1;
        int counter = 1;

        while(counter < total){
            System.out.println(number1 + " ");

            int result = number2 + number1;
            number1 = number2;
            number2 = result;
            counter = counter + 1;
        }
    }
}