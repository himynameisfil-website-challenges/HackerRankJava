package com.hackerrank.driver.Algorithms.Easy.FizzBuzz;
import org.junit.*;
/*"Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number
and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.


ex: 1 = 1
2 = 2
3 = Fizz
4 = 4
5 = Buzz
...
15 = FizzBuzz

 */

import com.hackerrank.driver.Algorithms.Easy.FizzBuzz.FizzBuzzConverter;

public class FizzBuzzTest {
    @Test
    public void HappyTestLeavesNumberAloneTest() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assert.assertEquals(  "1", fizzBuzz.convert(1));
        Assert.assertEquals( "2", fizzBuzz.convert(2));

    }

    @Test public void HappyTestConvertsToFizzTest() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals(  "Fizz", fizzBuzz.convert(3));
        Assert.assertEquals(  "Fizz", fizzBuzz.convert(6));
    }

    @Test public void HappyTestConvertsToBuzzTest() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals(  "Buzz", fizzBuzz.convert(5));
        Assert.assertEquals(  "Buzz", fizzBuzz.convert(10));
        Assert.assertEquals(  "Buzz", fizzBuzz.convert(20));
    }
    @Test public void HappyTestConvertsToFizzBuzzTest() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals(  "FizzBuzz", fizzBuzz.convert(15));
        Assert.assertEquals(  "FizzBuzz", fizzBuzz.convert(30));
    }
}
