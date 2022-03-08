package com.espaceptc.mylibrary;

import com.espaceptc.mylibrary.Exceptions.ListParamException;
import com.espaceptc.mylibrary.Exceptions.SizeParamException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLibraryTest {
    private List<Integer> listeInt;

    @Before
    public void init() {
        listeInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    @Test(expected = SizeParamException.class)
    public void shouldGetExceptionWhenSizeIsNegative() throws Exception {
        MyLibrary.partition(listeInt, -2);
    }

    @Test(expected = ListParamException.class)
    public void shouldGetExceptionWhenListeIsNull() throws Exception {
        MyLibrary.partition(null, 3);
    }

    @Test
    public void shouldGetListPartitionWithsizeEqual2() throws Exception {
        int size = 2;
        List<ArrayList<Integer>> listOfList = MyLibrary.partition(Arrays.asList(1, 2, 3, 4, 5), size);
        Assert.assertEquals(listOfList, Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5)));
    }

    @Test
    public void shouldGetListPartitionWithsizeEqual3() throws Exception {
        int size = 3;
        List<ArrayList<Integer>> listOfList = MyLibrary.partition(Arrays.asList(1, 2, 3, 4, 5), size);
        Assert.assertEquals(listOfList, Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5)));
    }

    @Test
    public void shouldGetListPartitionWithsizeEqual1() throws Exception {
        int size = 1;
        List<ArrayList<Integer>> listOfList = MyLibrary.partition(Arrays.asList(1, 2, 3, 4, 5), size);
        Assert.assertEquals(listOfList, Arrays.asList(Arrays.asList(1), Arrays.asList(2),
                Arrays.asList(3), Arrays.asList(4), Arrays.asList(5)));

    }
}