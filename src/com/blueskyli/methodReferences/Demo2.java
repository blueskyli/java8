package com.blueskyli.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Description: 方法引用
 * @author Jack
 * @date 2017年1月7日 下午3:56:49
 */
public class Demo2
{
    public static void main(String[] args)
    {
        //引用构造函数
        PersonFactory factory = new PersonFactory(Person::new);
        List<Person> list = new ArrayList<Person>();
        
        Person p1 = factory.getPerson();
        p1.setName("jack");
        list.add(p1);
        Person p2 = factory.getPerson();
        p2.setName("wash");
        list.add(p2);
        Person p3 = factory.getPerson();
        p3.setName("boro");
        list.add(p3);
        
        list.forEach(x -> System.out.println(x.getName()));
        System.out.println();
        
        Person[] array = list.toArray(new Person[list.size()]);
        System.out.println("原对象：");
        pringArray(array);
        
        // 引用静态方法
        // Arrays.sort(array, Demo2::myCompare);
        // 等同于
        Arrays.sort(array, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("排序后");
        pringArray(array);
    }
    
    public static void pringArray(Person[] perons)
    {
        for(Person person : perons)
        {
            System.out.println(person.name + "");
        }
        System.out.println();
    }
    
    public static int myCompare(Person p1, Person p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
    
    static class Person
    {
        private String name;
        
        public Person()
        {
            // TODO Auto-generated constructor stub
        }
        
        public String getName()
        {
            return name;
        }
        
        public void setName(String name)
        {
            this.name = name;
        }
        
        private int compare(Person p1, Person p2)
        {
            return p1.getName().compareTo(p2.getName());
        }
        
        private int compareTo(Person p1)
        {
            return this.getName().compareTo(p1.getName());
        }
    }
    
    static class PersonFactory
    {
        // 无输入参数,返回T的实例
        private Supplier<Person> supplier;
        
        public PersonFactory(Supplier<Person> supplier)
        {
            this.supplier = supplier;
        }
        
        public Person getPerson()
        {
            return supplier.get();
        }
    }
}
