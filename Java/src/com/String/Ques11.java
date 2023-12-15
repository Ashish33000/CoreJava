package com.String;

public class Ques11 {

	public static void main(String[] args) {
	
		String sentence = "Hello Ashish how are you?";

      
        String[] words = sentence.split(",\\s*");

      
        System.out.println("Splitting the sentence:");
        for (String word : words) {
            System.out.println(word);
        }

	}

}
