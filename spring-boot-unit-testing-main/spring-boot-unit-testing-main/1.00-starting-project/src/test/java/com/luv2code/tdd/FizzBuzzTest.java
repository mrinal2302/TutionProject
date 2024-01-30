package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {
    //if number is divisible by 3,print Fizz
    //if number is divisible by 5,print Buzz
    //if number is divisible by 3 and 5, print FizzBuzz
    //if number is not divisible by 3 or 5, then print the number
    @DisplayName("Divisible by three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expexted = "Fizz";

        assertEquals(expexted,FizzBuzz.compute(3),"should return Three");
    }

    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expexted = "Buzz";

        assertEquals(expexted,FizzBuzz.compute(5),"should return Five");
    }

    @DisplayName("Divisible by Three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expexted = "FizzBuzz";

        assertEquals(expexted,FizzBuzz.compute(15),"should return Three and Five");
    }

    @DisplayName("Not Divisible by Three and Five")
    @Test
    @Order(4)
    void testForNotDivisibleByThreeAndFive(){
        String expexted = "1";

        assertEquals(expexted,FizzBuzz.compute(1),"should return 1");
    }

    @DisplayName("Testing With Small Data File")
    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testSmallDataFile(int value,String expected){

        assertEquals(expected,FizzBuzz.compute(value));
    }

    @DisplayName("Testing With Medium Data File")
    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @Order(6)
    void testMediumDataFile(int value,String expected){

        assertEquals(expected,FizzBuzz.compute(value));
    }

    @DisplayName("Testing With Large Data File")
    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @Order(7)
    void testLargeDataFile(int value,String expected){

        assertEquals(expected,FizzBuzz.compute(value));
    }
}
