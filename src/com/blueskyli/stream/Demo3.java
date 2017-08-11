package com.blueskyli.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: http://www.cnblogs.com/invoker-/p/6896865.html http://www.cnblogs.com/invoker-/p/6904942.html
 * @author Jack
 * @date 2017年8月3日 下午11:42:09
 */
public class Demo3
{
    
    public static void main(String[] args)
    {
        // demo_stream();
        // demo_collect();
        demo_max();
        // demo_reduce();
    }

    /**
     * 
     * @Description: 归约reduce
     * @author Jack
     * @date 2017年8月8日 下午2:46:16
     *
     */
    private static void demo_reduce()
    {
        // reduce的第一个参数表示初始值为0；
        // reduce的第二个参数为需要进行的归约操作，它接收一个拥有两个参数的Lambda表达式，以上代码acc参数代表当前的数值总和,element代表下一个元素，reduce会把流中的元素两两输给Lambda表达式，最后将计算出累加之和。
        // 也就是说每次acc+element的返回值都会赋给acc
        int count = Stream.of(1, 4, 2, 5).reduce(0, (acc, element) -> acc + element);
        System.out.println(count);
        // 上面的方法中我们自己定义了Lambda表达式实现求和运算，如果当前流的元素为数值类型，那么可以使用Integer提供了sum函数代替自定义的Lambda表达式，如：
        int age = Stream.of(1, 4, 2, 5).reduce(0, Integer::sum);
        int max = Stream.of(1, 4, 2, 5).reduce(0, Integer::max);
        int min = Stream.of(1, 4, 2, 5).reduce(0, Integer::min);
        System.out.println(age);
        System.out.println(max);
        System.out.println(min);
    }
    
    private static void demo_max()
    {
        List<Integer> integers = Arrays.asList(2, 3, 6, 12, 8, 9);
        // Integer max = integers.stream().max(new Comparator<Integer>()
        // {
        // @Override
        // public int compare(Integer o1, Integer o2)
        // {
        // return o1.compareTo(o2);
        // };
        // }).get();
        
        Integer max = integers.stream().max((o1, o2) -> {
            return o1.compareTo(o2);
        }).get();
        System.out.println(max);
        max = integers.stream().max(Demo3::max).get();
        System.out.println(max);
        max = integers.stream().reduce(0, Demo3::max1);
        System.out.println(max);
        max = integers.stream().reduce(0, Integer::max);
        System.out.println(max);
    }
    
    /**
     * 
     * @Description: 自定义方法
     * @author Jack
     * @date 2017年8月8日 下午3:05:04
     *
     * @param a
     * @param b
     * @return
     */
    private static int max(Integer a, Integer b)
    {
        return a.compareTo(b);
    }
    
    private static int max1(Integer a, Integer b)
    {
        return Math.max(a, b);
    }
    
    private static void demo_collect()
    {
        List<String> strings = Arrays.asList("efg", "", "abc", "bc", "ghij", "", "lmn");
        String str = strings.stream()// 将list转换成流
                .filter(x -> !x.isEmpty())// 一系列惰性求值，返回Stream
                .collect(Collectors.joining(",")); // 及早求值，返回最终结果
        System.out.println(str);
    }
    
    private static void demo_stream()
    {
        // •对于数组来说,通过Arrays类提供的静态函数stream()获取数组的流对象
        // String[] names = {"jhon", "jacky", "jack"};
        // Stream<String> stream = Arrays.stream(names);
        // stream.forEach(System.out::println);
        //
        // •直接将几个普通的数值变成流对象
        // Stream<String> stream2 = Stream.of("hello", "YES", "NO");
        // stream2.forEach(System.out::println);
        
        String[] names = {"jhon", "jacky", "jack"};
        Stream<String> stream2 = Stream.of(names);
        stream2.forEach(System.out::println);
        
        //•对于集合来说,直接通过stream()方法即可获取流对象 
        List<Integer> integers = Arrays.asList(1, 3, 6, 2, 8, 9);
        Stream<Integer> stream = integers.stream();
        stream.forEach(System.out::println);
    }
}
