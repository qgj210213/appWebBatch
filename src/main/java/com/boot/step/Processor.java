package com.boot.step;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author qiguangjie
 * 2.3 Item Processor
 * 处理：将字符串转为大写
 *
 */
public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String data) throws Exception {
        return data.toUpperCase();
    }

}