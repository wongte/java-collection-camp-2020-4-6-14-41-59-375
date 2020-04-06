package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class ReduceTest {

    @Test
    public void should_get_average_of_list() {
        //獲取數組的平均值
        Integer[] array = new Integer[]{12, 34, 56, 78, 90, 21};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getAverage()).isEqualTo(48.5);
    }


    @Test
    public void should_return_index_of_first_even_element() {
        //獲取數組中第一個偶數的下標
        Integer[] array = new Integer[]{1, 11, 27, 20, 4, 9, 15, 4, 1, 11};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getIndexOfFirstEven()).isEqualTo(3);
    }

    @Test
    public void should_return_last_even_element() {
        //獲取數組中最後一個奇數
        Integer[] array = new Integer[]{1, 11, 27, 20, 4, 9, 15};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getLastOdd()).isEqualTo(15);
    }


}
