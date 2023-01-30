package org.example;

public class Answer4 {
    public void isPalindrome(String test){
        int strLength = test.length();

        for(int i = 0; i < strLength/ 2 ; i++){
            if(test.charAt(i) != test.charAt(strLength - i -1)){
                System.out.println("It is Not a Palindrome");
            }else {
                System.out.println("It is a Palindrome");
            }
        }
    }
}
