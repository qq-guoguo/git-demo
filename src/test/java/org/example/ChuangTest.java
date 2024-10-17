package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChuangTest {
    Chuang testObj;
    @Test
    void testChuang() {
        testObj = new Chuang(5.0, 8.0);
        String expected = "良好";
        assertTrue(testObj.getGrade() == expected);
    }

}