package org.example;

import java.util.ArrayList;

public class Answer5 {
    public void combiningList(){
        ArrayList<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");

        ArrayList<Object> result = new ArrayList<>();
        int letterIncrement = 0, numberIncrement = 0;
        while (letterIncrement < letters.size() || numberIncrement < numbers.size()){
            if (letterIncrement < letters.size()){
                result.add(letters.get(letterIncrement++));
            }
            if (numberIncrement < numbers.size()){
                result.add(numbers.get(numberIncrement++));
            }
        }
        System.out.println(result);
    }
}
