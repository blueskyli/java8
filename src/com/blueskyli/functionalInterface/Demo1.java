package com.blueskyli.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Description: TODO
 * http://www.cnblogs.com/MoEee/p/7229073.html
 * @author Jack
 * @date 2017年8月8日 下午6:09:31
 */
public class Demo1
{
    public static void main(String[] args)
    {
        // Function<T, R> 有参有返
        Function<String, String> func = x -> {
            System.out.print(x + ": ");
            return "function";
        };
        System.out.println(func.apply("hello word"));
        
        // Consumer<T> - 有参无返
        Consumer<String> consumer = x -> {
            System.out.println(x);
        };
        consumer.accept("hello world");
        
        // Supplier<T> 无参有返
        Supplier<String> supplier = () -> {
            System.out.print("hello :");
            return "world";
        };
        System.out.println(supplier.get());
        
        // Predicate<T> -T作为输入，返回的boolean值作为输出
        Predicate<String> predicate = x -> {
            System.out.print(x + ": ");
            return true;
        };
        System.out.println(predicate.test("hello"));
        
        // BinaryOperator<T> -两个T作为输入，返回一个T作为输出
        BinaryOperator<String> binaryOperator = (x, y) -> {
            System.out.print(x + y + " ");
            return "world";
        };
        System.out.println(binaryOperator.apply("hell", "o"));
    }
}
