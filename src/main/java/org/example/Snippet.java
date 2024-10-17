package org.example;
import java.util.Scanner;
public class Snippet {
    @SuppressWarnings("resoure")
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        double sm=0.0;
        double s=0.0;
        System.out.println("请输入单项最高分和总分，以等号结束；");
        while(reader.hasNextDouble()){
            sm= reader.nextDouble();
            s= reader.nextDouble();
        }
        String result="";
        String expected="";
        String output="";
//        测试用例1
        Chuang testObj=new Chuang(6.0,8.0);
        result = testObj.getGrade();
        expected="优秀";//预期执行结果
        if(result==expected){
            output="pass";
        }else {
            output="Fail,单项最高分6，总分8，成绩应该是"+expected;
        }
        System.out.println(output);
//        测试用例2
        testObj=new Chuang(4.0,6.0);
        result = testObj.getGrade();
        expected="良好";//预期执行结果
        if(result==expected){
            output="pass";
        }else {
            output="Fail,单项最高分4，总分6，成绩应该是"+expected;
        }
        System.out.println(output);


//        output = "单项最高分" + sm + "，总分" + s + "，成绩是" + result
    }
}
