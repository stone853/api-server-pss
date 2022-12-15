package com.sk.web.utils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author jinshi
 * @Date 2021/9/6 11:59
 * @Version 1.0
 */


public class AccumulateWorkTime {
    public static void main(String[] args) {
        String fileName = "D:\\123.xlsx";
        //调用easyExcel里面的方法实现写操作
        //2个参数，第一个参数是文件名称，第二个参数是实体类
        EasyExcel.read(fileName, DataModel.class, new ExcelListener()).sheet(1).doRead();
        //AccumulateWorkTime.read2();
    }


    private static void read2() {
        final List list = new ArrayList();
        //使用EasyExcel读取test1.xlsx文件
        EasyExcel.read("D://123.xlsx", AccumulateWorkTime.class, new AnalysisEventListener<AccumulateWorkTime>() {
                    //重写子类方法
                    @Override
                    public void invoke(AccumulateWorkTime question1, AnalysisContext analysisContext) {
                        list.add(question1);
                    }
                    //重写子类方法
                    @Override
                    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                    }

                    @Override
                    public void invokeHeadMap(Map headMap, AnalysisContext context) {
                        System.out.println(headMap.toString());
                    }
                }
        ).doReadAll();

        //获取读取到的数据
        for (Object o : list) {
            AccumulateWorkTime question1 = (AccumulateWorkTime) o;
            System.out.println(question1.toString());
        }

    }

}
