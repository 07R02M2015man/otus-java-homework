package ru.otus.java.basic.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTests {

    @Test
    public void testArrayAfterLastOne() {
        int[] input1 = {1, 2, 1, 2, 2};
        int[] expected1 = {2, 2};
        Assertions.assertArrayEquals(expected1, MainApp.arrayAfterLastOne(input1));

        int[] input2 = {2, 2, 2, 2};
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.arrayAfterLastOne(input2));
    }

    @Test
    public void testCheckArray() {
        Assertions.assertTrue(MainApp.checkArray(new int[]{1,2}));
        Assertions.assertFalse(MainApp.checkArray(new int[]{1,1}));
        Assertions.assertFalse(MainApp.checkArray(new int[]{1,3}));
        Assertions.assertTrue(MainApp.checkArray(new int[]{1,2,2,1}));
    }


}

