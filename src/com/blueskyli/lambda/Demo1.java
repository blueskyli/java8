package com.blueskyli.lambda;

/**
 * @Description: TODO
 * @author Jack
 * @date 2017年8月3日 下午11:14:18
 */
public class Demo1
{
    public static void main(String[] args)
    {
        demo_runnable();
    }
    
    private static void demo_runnable()
    {
        // new Thread(new Runnable()
        // {
        // @Override
        // public void run()
        // {
        // System.out.println("java8之前的代码");
        //
        // }
        // }).start();
        
//        new Thread(() -> {
//            System.out.println("我是java8的代码");
//        }).start();
        
        Runnable runnable = ()->System.out.println("hello a ");
        runnable.run();
        new Thread(runnable).start();
        
    }
}
