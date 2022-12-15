package com.sk.web.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

/**
 * @Author jinshi
 * @Date 2022/8/24 18:00
 * @Version 1.0
 */
public class ExcelListener extends AnalysisEventListener<DataModel> {
    /**
     * 一行一行的读取excel内容
     */
    @Override
    public void invoke(DataModel data, AnalysisContext analysisContext) {
        System.out.println("****" + data);
    }

    /**
     * 读取表头内容
     */
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头" + headMap);
    }
    /**
     * 读取完成操作
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("读取Excel完毕");
    }
}