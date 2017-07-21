package com.blueskyli.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Description: 函数式编程
 * @author Jack
 * @date 2017年2月20日 下午2:44:28
 */
public class NewFeatureTester1
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        System.out.println("list输出结果");
        
        eval(list, x -> true);
        
        eval(list, x -> x % 2 == 0);
        
        System.out.println("输出数组中大于5的值");
        eval(list, x -> x > 5);
    }
    
    /**
     * 
     * @Description: TODO
     * @author Jack
     * @date 2017年2月20日 下午2:47:52
     *
     * @param list
     * @param predicate
     *            断言操作
     */
    private static void eval(List<Integer> list, Predicate<Integer> predicate)
    {
        for(Integer n : list)
        {
            if(predicate.test(n))
            {
                System.out.println(n);
            }
        }
        
    }
}
