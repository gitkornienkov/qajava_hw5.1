package org.korndev.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {

    @ParameterizedTest

    @CsvSource({
        "10000, 3000, 20000",

    })
public void testCalcServiceVar1(int income, int expenses, int thershold) {
        CalcService service = new CalcService();

        int actual = service.calculate(income, expenses, thershold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
}
    @ParameterizedTest
    @CsvSource({
            "100000, 60000, 150000"
    })
    public void testCalcServiceVar2(int income, int expenses, int thershold) {
        CalcService service = new CalcService();

        int actual = service.calculate(income, expenses, thershold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}
