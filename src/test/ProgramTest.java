import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertTrue;

class ProgramTest {

    @Test
    void testDoesNotEndIn3() {
        //Some numbers NOT ending with 3:
        Assertions.assertTrue(Program.doestNotEndsIn3(55));
        Assertions.assertTrue(Program.doestNotEndsIn3(5));
        Assertions.assertTrue(Program.doestNotEndsIn3(224));
        Assertions.assertTrue(Program.doestNotEndsIn3(6348));
        Assertions.assertTrue(Program.doestNotEndsIn3(1));
        Assertions.assertTrue(Program.doestNotEndsIn3(167));
        //Some numbers ending with 3:
        Assertions.assertFalse(Program.doestNotEndsIn3(3));
        Assertions.assertFalse(Program.doestNotEndsIn3(53));
        Assertions.assertFalse(Program.doestNotEndsIn3(45873));
        Assertions.assertFalse(Program.doestNotEndsIn3(1243));

    }
    @Test
    void testIsPrime() {
        //Some known prime numbers:
        Assertions.assertTrue(Program.isPrime(2));
        Assertions.assertTrue(Program.isPrime(11));
        Assertions.assertTrue(Program.isPrime(13));
        Assertions.assertTrue(Program.isPrime(41));
        Assertions.assertTrue(Program.isPrime(73));
        //Some NOT prime numbers:
        Assertions.assertFalse(Program.isPrime(72));
        Assertions.assertFalse(Program.isPrime(22));
        Assertions.assertFalse(Program.isPrime(50));
        Assertions.assertFalse(Program.isPrime(85));
    }
    @Test
    void testNumbersAreNotEqual() {
        //Some not equal numbers:
        Assertions.assertTrue(Program.numbersAreNotEqual(1,2,3));
        Assertions.assertTrue(Program.numbersAreNotEqual(10,25,55));
        Assertions.assertTrue(Program.numbersAreNotEqual(7,58,987545));
        //Some numbers with match:
        Assertions.assertFalse(Program.numbersAreNotEqual(1,2,1));
        Assertions.assertFalse(Program.numbersAreNotEqual(5,5,3));
        Assertions.assertFalse(Program.numbersAreNotEqual(66,21,66));
    }
}