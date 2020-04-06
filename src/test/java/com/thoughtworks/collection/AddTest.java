package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class AddTest {

    @Test
    public void should_get_sum_of_evens() {
        //求leftBorder 和rightBorder之間的偶數和
        int leftBorder = 1;
        int rightBorder = 10;

        Add add = new Add();
        assertThat(add.getSumOfEvens(leftBorder, rightBorder)).isEqualTo(30);
        assertThat(add.getSumOfEvens(rightBorder, leftBorder)).isEqualTo(30);
    }

    @Test
    public void should_get_sum_of_odds() {
        //求leftBorder 和rightBorder之間的奇數和
        int leftBorder = 1;
        int rightBorder = 10;

        Add add = new Add();
        assertThat(add.getSumOfOdds(leftBorder, rightBorder)).isEqualTo(25);
        assertThat(add.getSumOfOdds(rightBorder, leftBorder)).isEqualTo(25);
    }

    @Test
    public void should_get_triple_and_add_two() {
        //求數組中每個元素的3倍加2的和
        Integer[] array = new Integer[]{1, 5, 7, 11, 35, 67};
        List<Integer> arrayList = Arrays.asList(array);

        Add add = new Add();

        assertThat(add.getSumTripleAndAddTwo(arrayList)).isEqualTo(390);
    }

    @Test
    public void should_get_triple_of_odd_and_add_two() {
        //求數組中奇數元素的3倍加2，偶數元素不變的數組
        Integer[] array = new Integer[]{1, 5, 7, 12, 11, 35, 54, 67, 70};
        List<Integer> arrayList = Arrays.asList(array);

        Integer[] result = new Integer[]{5, 17, 23, 12, 35, 107, 54, 203, 70};
        List<Integer> resultList = Arrays.asList(result);

        Add add = new Add();

        assertThat(add.getTripleOfOddAndAddTwo(arrayList)).isEqualTo(resultList);
    }

    @Test
    public void should_get_sum_of_processed_odd() {
        //求數組中奇數元素的3倍加5的和
        Integer[] array = new Integer[]{1, 5, 7, 12, 11, 35, 54, 67, 70};
        List<Integer> arrayList = Arrays.asList(array);
        Add add = new Add();

        assertThat(add.getSumOfProcessedOdds(arrayList)).isEqualTo(408);
    }


    @Test
    public void should_return_whether_include_special_element() {
        //求數組中所有偶數組成的數組是否包含某特定的數specialElement
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(array);

        Add add = new Add();

        Integer existedElement = 3;
        assertThat(add.isIncludedInEven(arrayList, existedElement)).isEqualTo(false);

        Integer nonexistentElement = 2;
        assertThat(add.isIncludedInEven(arrayList, nonexistentElement)).isEqualTo(true);
    }

    @Test
    public void should_sort_by_even_and_odd() {
        //排序數組 結果使數組偶數在遞增在前，奇數遞減在後
        Add add = new Add();

        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> arrayList = Arrays.asList(array);

        Integer[] result = new Integer[]{2, 4, 6, 8, 7, 5, 3, 1};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(add.sortByEvenAndOdd(arrayList)).isEqualTo(resultList);
    }
}
