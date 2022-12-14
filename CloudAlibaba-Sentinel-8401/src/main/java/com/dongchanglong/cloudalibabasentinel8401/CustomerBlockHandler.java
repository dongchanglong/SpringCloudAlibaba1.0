package com.dongchanglong.cloudalibabasentinel8401;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * 此类型用来处理限流自定义逻辑
 */
public class CustomerBlockHandler {
    // 必须是静态方法
    public static String handlerException1(BlockException exception){
        return "handlerException1：系统异常，请稍后重试！";
    }
    public static String handlerException2(BlockException exception){
        return "handlerException2：网络崩溃了，请稍后重试！";
    }
}