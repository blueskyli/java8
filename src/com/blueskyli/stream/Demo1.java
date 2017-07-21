package com.blueskyli.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @author Jack
 * @date 2017年7月13日 上午1:29:20
 */
public class Demo1
{
    public static void main(String[] args)
    {
        // Random random = new Random();
        // random.ints().limit(10).forEach(x -> System.out.println(x));
        
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 6, 5, 4);
        // numbers.stream().map(i -> i * i).forEach(System.out::println);
        // List<Integer> list = numbers.stream().map(x -> x + 2).distinct().collect(Collectors.toList());
        // list.forEach(System.out::println);
        //
        // numbers.stream().filter(x -> x > 4).forEach(System.out::println);
        
        Integer findFirst = numbers.stream().findFirst().get();
        System.out.println(findFirst);
        
        List<String> strings = Arrays.asList("efg", "", "abc", "bc", "ghij", "", "lmn");
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
        String str = strings.stream().filter(x -> !x.isEmpty()).collect(Collectors.joining(","));
        System.out.println(str);
        
    }
    
}
