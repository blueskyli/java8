package com.blueskyli.functionalInterface;

/**
 * @Description: 默认方法
 * @author Jack
 * @date 2017年6月6日 下午6:00:08
 */
public class NewFeatureTester2
{
    public interface younger
    {
        default void print()
        {
            System.out.println("I am a younger");
        }
    }

    public interface learner
    {
        default void print()
        {
            System.out.println("I am learner");
        }
        
        static void sayHi()
        {
            System.out.println("hello hi");
        }
    }
    
    public class student implements younger, learner
    {
        @Override
        public void print()
        {
            System.out.println("I am a younger and learner,so I am a student");
        }
    }
    
    public class student2 implements younger, learner
    {
        @Override
        public void print()
        {
            learner.super.print();
        }
    }
    
    public static void main(String[] args)
    {
        younger _student = new NewFeatureTester2().new student();
        _student.print();
        
        younger _student2 = new NewFeatureTester2().new student2();
        _student2.print();
        
        // 静态默认方法
        learner.sayHi();
    }
}