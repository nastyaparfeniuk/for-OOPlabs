package com.forlabs;

public class Sentence implements Comparable<Sentence> {
    String _text;

    public Sentence(String text) {
        _text = text;
    }

    public int compareTo(Sentence other) {
        Integer currentWordsCount = GetWords(GetText());
        Integer otherWordsCount = other.GetWords(GetText());
        return currentWordsCount.compareTo(other.GetWords(GetText()));
    }

    public String GetText() {
        return _text;
    }

    public int GetWords(String text) {
        int wordsCounter = 0;

        for (int i = 0; i < text.length() - 1; i++) {
            //Counts all the spaces present in the string
            //It doesn't include the first space as it won't be considered as a word
            if (text.charAt(i) == ' ' && Character.isLetter(text.charAt(i + 1)) && i > 0) {
                wordsCounter++;
            }
        }
        //To count the last word present in the string, increment wordCount by 1
        wordsCounter++;

        return wordsCounter;
    }
}
