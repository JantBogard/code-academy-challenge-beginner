package com.jant;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static String wordReversal(String words) {
        words = words.toLowerCase();
        String[] wordList = words.split(" ");
        String wordReverse = new String();

        for (int i = wordList.length - 1; i >= 0; i--) {
            wordReverse += " " + wordList[i];
        }

        // wordReverse = checkSentenceEnders(wordReverse);

        return capitalize(wordReverse);
    }

    public static String capitalize(String word) {
        String firstLetter = word.substring(1, 2).toUpperCase();
        String restLetters = word.substring(2);

        return firstLetter + restLetters;
    }

    public static String checkSentenceEnders(String word) {
        String[] sentenceEnders = { ".", "?", "!" };
        String firstLetter = word.substring(1, 2);
        String restLetters = word.substring(2);
        boolean check = false;

        for (int i = 0; i < sentenceEnders.length; i++) {
            if (firstLetter.contains(sentenceEnders[i])) {
                check = true;
            }
        }

        if (check) {
            return restLetters + firstLetter;
        }
        return firstLetter + restLetters;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = new String();

        System.out.println("Welcome in Word reversal");
        System.out.println("\nPlease enter a sentence: ");
        word = keyboard.nextLine();

        System.out.println("\n\nYour reversal word is: ");
        System.out.println(wordReversal(word));

        keyboard.close();
    }
}
