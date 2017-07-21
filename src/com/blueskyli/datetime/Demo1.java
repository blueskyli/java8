package com.blueskyli.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Description: java8中的时间
 * @author Jack
 * @date 2017年7月13日 上午2:02:47
 */
public class Demo1
{
    public static void main(String[] args)
    {
        // 当前日期和时间
        LocalDateTime time = LocalDateTime.now();
        System.out.println("current date and  time :" + time);
        
        // 输出当前时间的本地值
        LocalDate localDate = time.toLocalDate();
        System.out.println("local date:" + localDate + " " + time.toLocalTime());
        
        System.out.println(LocalTime.parse("20:12:12"));
    }
}
