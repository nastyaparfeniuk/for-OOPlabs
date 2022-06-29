package com.forlabs;

import java.util.*;

public class Lab3 {

    //Метод для перетворення String[] на String
    public static String ToText(String[] str, int n){
        String text = "";
        for (int i = n; i < str.length; i++){
            text += str[i] + " ";
        }
        return text;
    }

    // Метод для підрахунку к-сті слів
    public static int WordsCount(String sentence){
        int words_counter = 0;
        for (int i = 0; i < sentence.length() - 1; i++){
            if (sentence.charAt(i) == ' '&&Character.isLetter(sentence.charAt(i+1))&&(i > 0)){
                words_counter++;
            }
        }
        words_counter++;
        return words_counter;
    }
    public static void main(String[] args) {
        // 1514 - номер залікової книжки

        // Визначаємо константи відповідно до варіанту
        final int C3 = 1514 % 3;
        System.out.println("C3 = " + C3);
        final int C13 = 1514 % 17;
        System.out.println("C13 = " + C13);

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
                "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
                "mollit anim id est laborum.";

        // Розділяємо текст на речення
        String[] rawSentences = text.split("(?<=\\.)");
        // 2. Create List of Sentences (each Sentence object contains methods that return sentence's Text and Count of words in it)
        List<Sentence> sentences = new ArrayList<Sentence>();
        for (String rawSentence : rawSentences)
        {
            Sentence sentence = new Sentence(rawSentence);
            sentences.add(sentence);
        }
        // 3. Sort List of Sentences
        // sentences.Sort((x, y) => x.GetWords().CompareTo(y.GetWords()));
        // Collections.sort(sentences);
        Collections.sort(sentences, Comparator.comparing(Sentence::GetText));

        // 4. Loop through the sorted collection
        for (Sentence sentence : sentences)
        {
            System.out.println("Sentence: " + sentence.GetText());
            System.out.println("Words Count: " + sentence.GetWords(sentence.GetText()));
        }

    }
}



