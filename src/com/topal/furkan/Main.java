package com.topal.furkan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    final long startTime = System.nanoTime();

    printAnagramPairs("words_alpha.txt");

    final long duration = System.nanoTime() - startTime;
    System.out.println("Duration of the program is: " + duration + " nanosecond.");
  }

  public static Map<String, ArrayList<String>> getValuesFrom(String path) {

    HashMap<String, ArrayList<String>> anagrams = new HashMap<>();

    try (Scanner scanner = new Scanner(new File(path))) {

      while (scanner.hasNextLine()) {

        String word = scanner.nextLine();
        String sortedWord = sortWords(word);

        ArrayList<String> words;
        if (anagrams.containsKey(sortedWord)) {
          words = anagrams.get(sortedWord);
        } else {
          words = new ArrayList<>();
        }

        words.add(word);
        anagrams.put(sortedWord, words);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return anagrams;
  }

  public static String sortWords(String word) {
    char[] chars = word.toLowerCase().toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

  public static void printAnagramPairs(String path) {

    for (Map.Entry<String, ArrayList<String>> anagram : getValuesFrom(path).entrySet()) {

      if (anagram.getValue().size() > 1) {
        System.out.println(anagram.getValue());
      }
    }
  }
}
