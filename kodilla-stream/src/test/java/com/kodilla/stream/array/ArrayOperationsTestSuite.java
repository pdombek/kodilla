package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given
        int numbers[] = {1, 5, 4, 1, 4, 5, 9};

        //When
        double results = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(4.14, results, 0.01);
    }
}
