package com.blueskyli.methodReferences;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 方法引用 
 * 方法引用的唯一用途是支持lambda表达式的简写
 * 方法引用仅仅是Lambda的配套服务，主要目的是通过名字来获得Lambda，重复利用已有的方法
 * 方法引用分为四类
 * 1，引用静态方法
 *      例子: String::valueOf，对应的Lambda：(s) -> String.valueOf(s) 
 * 2，引用特性对象的实例方法
 *      例子: x::toString，对应的Lambda：() -> this.toString() 
 * 3，引用特定类型的任意对象的实例
 *      例子: String::toString，对应的Lambda：(s) -> s.toString() 
 * 4，引用构造函数
 *      例子: String::new，对应的Lambda：() -> new String() 
 * @author Jack
 * @date 2017年1月7日 下午3:41:16
 */
public class Demo1
{
    
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("jack1");
        list.add("jack2");
        list.add("jack3");
        list.add("jack4");
        list.add("jack5");
        list.add("jack6");
        
        list.forEach(System.out::println);
        
        list.forEach(x -> System.out.println(x));
        

    }
    
}
