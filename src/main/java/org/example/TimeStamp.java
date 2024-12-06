package org.example;

import java.time.Instant;

public class TimeStamp {
    public static String getTimeStamp() {
        // 获取当前时间的UTC时间戳（秒）
        long currentTimeMillis = Instant.now().toEpochMilli(); // 毫秒级时间戳
        long currentTimeSeconds = currentTimeMillis / 1000; // 转换为秒级时间戳
        return String.valueOf(currentTimeSeconds);
    }
}