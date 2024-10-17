package org.example;

public class test {
    Chuang chuangObj;
    public void createTestObj(double sm,double s) {chuangObj = new Chuang(sm, s);}
    public void freeTestObj() {chuangObj = null;}
    public boolean verify(String expected, String actual) {
        if (expected.equals(actual)) {
            return true;
        }
        else {
            return false;
        }
    }
    public String record(double sm, double s, String expected, String actual, boolean testResult) {
        String output="";
        if(testResult) {
            output+= "Pass. 单项最高分:" + sm + ", 总分:" + s;
        }else {
            output+= "Fail. 单项最高分:" + sm + ", 总分:" + s +
                    ", Expected:" + expected + ", Actual:" + actual;
        }
        return output;
    }
    public void testGetGrade1() {
        createTestObj(5.0, 8.0);
        String actual = chuangObj.getGrade();
        boolean testResult = verify("优秀", actual);
        System.out.println(record(5.0, 8.0, "优秀", actual, testResult));
        freeTestObj();
    }
    public static void main(String[] args) {
        test t= new test();
        t.testGetGrade1();
    }
}