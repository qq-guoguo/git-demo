package org.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class ChuangTestBefore {
    Chuang testObj;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Run @BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Run @AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        testObj = new Chuang();
        System.out.println("Run @Before");
    }

    @After
    public void tearDown() throws Exception {
        testObj = null;
        System.out.println("Run @After");
    }
    @Test
    public void testChuangGreat() {
        testObj.single_Max=6.0;
        testObj.sum=8.0;
        String expected = "优秀";
        assertTrue(testObj.getGrade()==expected);
    }
    public void testChuangGood() {}
    public void testChuangOk() {}

    @Test
    public void testChuangPass() {
        testObj.single_Max=2.0;
        testObj.sum=4.0;
        String expected = "及格";
        assertTrue(testObj.getGrade()==expected);
    }

    @Test
    public void testChuangFail() {
        testObj.single_Max=2.0;
        testObj.sum=3.0;
        String expected = "不及格";
        assertTrue(testObj.getGrade()==expected);
    }
}