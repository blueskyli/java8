package com.blueskyli.functionalInterface;

import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * @Description: andThen和compose是Function接口的两个方法，作用是组合两个Function实例，达到高阶函数的效果，
 * 区别在于andThen是调用者的函数先执行，compose是参数里的先执行。
 * @author Jack
 * @date 2017年8月8日 下午6:57:57
 */
public class Demo2
{
    public static void main(String[] args)
    {
        new Demo2().demo_test();
    }
    
    private void demo_test()
    {
        int initNumber = 1;
        
        IntFunction<Integer> plus = val -> val + 3;
        
        System.out.println(compute(initNumber, plus));
        
        System.out.println(doubleOp(3, val -> val + 2, val -> val + 3));
        
        Function<Person, Integer> getAge = p -> p.getAge();
        
        Function<Integer, Boolean> isAdult = a -> a >= 18;
        
        System.out.println(isAdult.compose(getAge).apply(new Person("test", 19, "男")));
    }
    
    public static Integer compute(int value, IntFunction<Integer> function)
    {
        
        return function.apply(value);
        
    }
    
    public static Integer doubleOp(int value, Function<Integer, Integer> function1, Function<Integer, Integer> function2)
    {
        
        return function1.andThen(function2).apply(value);
        
    }
    
    public class Person
    {
        public Person(String name, int age, String sex)
        {
            super();
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        
        private String name;
        private int age;
        private String sex;
        
        public String getName()
        {
            return name;
        }
        
        public void setName(String name)
        {
            this.name = name;
        }
        
        public int getAge()
        {
            return age;
        }
        
        public void setAge(int age)
        {
            this.age = age;
        }
        
        public String getSex()
        {
            return sex;
        }
        
        public void setSex(String sex)
        {
            this.sex = sex;
        }
    }
}
