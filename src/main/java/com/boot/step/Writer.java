package com.boot.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * @author qiguangjie
 * 2.4 Item Writer
 * 输出：把转为大写的字符串输出到控制台
 *
 */
public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> messages) throws Exception {
        for (String msg : messages) {
            System.out.println("Writing the data " + msg);
        }
    }

}
