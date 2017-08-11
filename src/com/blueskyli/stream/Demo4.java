package com.blueskyli.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @author Jack
 * @date 2017年8月8日 下午6:30:11
 */
public class Demo4
{
    public static void main(String[] args)
    {
        new Demo4().demo_stream();
    }
    
    private void demo_stream()
    {
        List<Person> list = new ArrayList<>(
                Arrays.asList(new Person("John",11,"男"),
                        new Person("Robbin",22,"男"),
                        new Person("Sarah", 23, "女"),
                        new Person("Amanda", 23, "男"))
                );
        String collect = list.stream()
        .filter(x->x.getAge()>11)
        .map(x->x.getAge()+"_"+x.getSex())
        .collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);
        
        System.out.println(list.stream().filter(x -> x.getSex().equals("男")).mapToInt(x -> x.getAge()).sum());
        System.out.println(list.stream().filter(x -> x.getSex().equals("男"))
                .map(x->x.getAge())
                .reduce(0, (x, y) -> x + y));
        System.out.println(list.stream().filter(x -> x.getSex().equals("男"))
                .map(x->x.getAge())
                .reduce(0, Integer::sum));
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
