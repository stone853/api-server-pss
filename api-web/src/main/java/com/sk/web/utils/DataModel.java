package com.sk.web.utils;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @Author jinshi
 * @Date 2022/8/24 18:20
 * @Version 1.0
 */
public class DataModel {
    @ExcelProperty(index = 0)
    private String a1;


    @ExcelProperty(index = 1)
    private String b1;
    @ExcelProperty(index = 2)
    private String c1;
    @ExcelProperty(index = 3)
    private String d1;
    @ExcelProperty(index = 4)
    private String e1;
    @ExcelProperty(index = 5)
    private String f1;
    @ExcelProperty(index = 6)
    private String g1;
    @ExcelProperty(index = 7)
    private String h1;

    @ExcelProperty(index = 8)
    private String i1;

    private int totalWorkTime;



    public int getTotalWorkTime() {


        return totalWorkTime;
//        int tmpb1= Integer.parseInt(this.b1.substring(this.b1.indexOf("*")+1,this.b1.indexOf("小时")));
//        int tmpc1= Integer.parseInt(this.c1.substring(this.c1.indexOf("*")+1,this.c1.indexOf("小时")));
//        int tmpd1= Integer.parseInt(this.d1.substring(this.d1.indexOf("*")+1,this.d1.indexOf("小时")));
//        int tmpe1= Integer.parseInt(this.e1.substring(this.e1.indexOf("*")+1,this.e1.indexOf("小时")));
//        int tmpf1= Integer.parseInt(this.f1.substring(this.f1.indexOf("*")+1,this.f1.indexOf("小时")));
//        int tmpg1= Integer.parseInt(this.g1.substring(this.g1.indexOf("*")+1,this.g1.indexOf("小时")));
//        int tmph1= Integer.parseInt(this.h1.substring(this.h1.indexOf("*")+1,this.h1.indexOf("小时")));
//        int tmpi1= Integer.parseInt(this.i1.substring(this.i1.indexOf("*")+1,this.i1.indexOf("小时")));
//
//        return tmpa1 + tmpb1+tmpc1+tmpd1+tmpe1+tmpf1+tmpg1+tmph1+tmpi1;

    }



    public void setTotalWorkTime(int v) {
        this.totalWorkTime = this.totalWorkTime+v;
    }





    public void setB1(String b1) {
        this.b1 = b1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public void setE1(String e1) {
        this.e1 = e1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public String getA1() {
        String tmp = this.a1.substring(this.a1.indexOf("*")+1,this.a1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return a1;
    }

    public String getB1() {
        String tmp = this.b1.substring(this.b1.indexOf("*")+1,this.b1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return b1;
    }

    public String getC1() {
        String tmp = this.c1.substring(this.c1.indexOf("*")+1,this.c1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return c1;
    }

    public String getD1() {
        String tmp = this.d1.substring(this.d1.indexOf("*")+1,this.d1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return d1;
    }

    public String getE1() {
        String tmp = this.e1.substring(this.e1.indexOf("*")+1,this.e1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return e1;
    }

    public String getF1() {
        String tmp = this.f1.substring(this.f1.indexOf("*")+1,this.f1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return f1;
    }

    public String getG1() {
        String tmp = this.g1.substring(this.g1.indexOf("*")+1,this.g1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return g1;
    }

    public String getH1() {
        String tmp = this.h1.substring(this.h1.indexOf("*")+1,this.h1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return h1;
    }



    public String getI1() {
        String tmp = this.i1.substring(this.i1.indexOf("*")+1,this.i1.indexOf("小时"));
        if (null != tmp && !"".equals(tmp)) {
            this.setTotalWorkTime(Integer.parseInt(tmp));
        }
        return i1;
    }


    public void setI1(String i1) {
        this.i1 = i1;
    }


    public void setA1(String a1) {
        this.a1 = a1;
    }





    @Override
    public String toString() {
        return "a1=" +getA1() + ";b1="+getB1() +";c1="+getC1()+";d1"+getD1()+";e1="+getE1()+";f1"+getF1()+";g1="+getG1()+";h1"+getH1()+";i1="+getI1()+";totalWorkTime:"+this.getTotalWorkTime();
    }


}
