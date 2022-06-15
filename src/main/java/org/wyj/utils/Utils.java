package org.wyj.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    // 不允许实例化
    private Utils() {
    }

    // 返回日期格式化器，以指定的格式来格式化日期
    private static DateTimeFormatter getFormatter() {
        return StoreSingleton.formatter;
    }

    /**
     * 以指定的格式打印消息
     *
     * @param msg 消息
     */
    public static void println(String msg) {
        System.out.printf("[%s] [%s] %s%n", Thread.currentThread().getName()
                , getFormatter().format(LocalDateTime.now()), msg);
    }

    public static void println(Object msg) {
        System.out.printf("[%s] [%s] %s%n", Thread.currentThread().getName()
                , getFormatter().format(LocalDateTime.now()), msg);
    }

    // 使用静态内部类的形式来存储日期格式化器
    private static class StoreSingleton {
        private static final DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    }
}
