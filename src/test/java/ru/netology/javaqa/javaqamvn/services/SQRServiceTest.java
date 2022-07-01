package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.javaqa.javaqamvn.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    //@CsvSource({
    //        "6,10,99",
    //        "3,200,300",
    //        "1210,1,1000000"
    //})
    @CsvFileSource(files = "src/test/resources/values.csv")
    public void testModOne(int expected, int from, int before) {
        SQRService service = new SQRService();

        //int expected = 5;
        int actual = service.calcSqr(from, before);

        Assertions.assertEquals(expected, actual);
    }
}
