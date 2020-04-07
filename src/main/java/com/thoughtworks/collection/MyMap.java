package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(number -> number * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        int STARTING_CHARACTER = 96;
        return array.stream().map(number -> (char)(number + STARTING_CHARACTER) + "").collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        List<Integer> sortedArray = new ArrayList<>(array);
        sortedArray.sort(Collections.reverseOrder());
        return sortedArray;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> sortedArray = new ArrayList<>(array);
        Collections.sort(sortedArray);
        return sortedArray;
    }
}
