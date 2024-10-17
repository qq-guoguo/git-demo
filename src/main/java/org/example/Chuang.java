package org.example;


public class Chuang {
    double single_Max;
    double sum;

    public Chuang() {
    }
    public Chuang(double single_Max, double sum) {
        this.single_Max = single_Max;
        this.sum = sum;
    }

    public double getSingle_Max() {
        return single_Max;
    }
    public void setSingle_Max(double single_Max) {
        this.single_Max = single_Max;
    }
    public double getSum() {
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }
    public String getGrade(){
        String result="";
        if (single_Max>=5 || sum>=7)
            result = "优秀";
        else if (single_Max>=4 || sum >=6)
            result = "良好";
        else if ((single_Max>=3 && sum >=4) || sum>=5)
            result = "中等";
        else if (sum >=4)
            result = "及格";
        else
            result = "不及格" ;
        return result;
    }
}
