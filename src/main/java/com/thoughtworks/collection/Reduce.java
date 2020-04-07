package com.thoughtworks.collection;

import org.omg.CORBA.INTERNAL;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.IntStream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        int total = arrayList.stream().reduce(0, (subtotal, item) -> subtotal += item);
        return (double)total / arrayList.size();
    }


    public int getIndexOfFirstEven() {
        int INITIAL_INDEX = -1;
        return IntStream.range(0, arrayList.size()).reduce(INITIAL_INDEX, (firstEvenIndex, itemIndex) -> {
            return firstEvenIndex == INITIAL_INDEX && arrayList.get(itemIndex) % 2 == 0 ? itemIndex : firstEvenIndex;
        });
    }


    public int getLastOdd() {
        return arrayList.stream().reduce(0, (oddNumber, item) -> oddNumber = item % 2 == 1 ? item : oddNumber);
    }



}
