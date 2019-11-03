package com.qs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName HelloSlf4j
 * @Description
 * @Author qiaoshuai
 * @Date 2019/10/31 11:35
 * @Version 1.0
 */
public class HelloSlf4j {
    private static Logger LOGGER = LoggerFactory.getLogger(HelloSlf4j.class);
    public static void main(String[] args) {

        LOGGER.trace("trace");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.warn("warn");
        LOGGER.error("error");
    }
}
