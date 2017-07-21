package com.blueskyli.functionalInterface;

import java.util.Optional;

/**
 * @Description: Optional
 * @author Jack
 * @date 2017年6月7日 下午5:11:31
 */
public class NewFeatureTester3
{
    public static void main(String[] args)
    {
        Integer value1 = null;
        // Integer value2 = new Integer(5);
        Integer value2 = 5;
        
        // ofNullable 允许传参数给出null
        Optional<Integer> a = Optional.ofNullable(value1);
        
        Optional<Integer> b = Optional.of(value2);
        
        System.out.println(new NewFeatureTester3().sum(a, b));
    }
    
    public Integer sum(Optional<Integer> a, Optional<Integer> b)
    {
        //isPresent 用于检查值是否存在
        System.out.println("first parm is " + a.isPresent()); // false
        System.out.println("second parm is " + b.isPresent()); // true
        
        // 如果当前返回的是传入的默认值，orElse将返回他
        Integer value1 = a.orElse(0);
        
        Integer value2 = b.get();
        return value1 + value2;
    }
}
