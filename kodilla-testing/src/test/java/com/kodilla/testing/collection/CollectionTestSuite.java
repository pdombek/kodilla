package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        //When
        numbers.isEmpty();
        test.exterminate(numbers, even);

        //Then
        Assert.assertTrue(even.isEmpty());

    };

    @Test
    public void testOddNumbersExterminatorNormalList(){

        //Given
        OddNumbersExterminator test2 = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(14);
        numbers.add(21);
        numbers.add(38);
        numbers.add(45);

        //When
        ArrayList<Integer> even = new ArrayList();
        test2.exterminate(numbers,even);

        //Then
        ArrayList<Integer> expected = new ArrayList();
        expected.add(14);
        expected.add(38);
        Assert.assertEquals(expected, even);
    };
}
