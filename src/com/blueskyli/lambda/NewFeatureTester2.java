package com.blueskyli.lambda;

/**
 * @Description: lambda
 * @author Jack
 * @date 2017年1月7日 下午3:25:56
 */
public class NewFeatureTester2
{
    public static void main(String[] args)
    {
        SayHello sayHello1 =x->System.out.println("没有括号的表达式："+x);
        SayHello sayHello2 = (x) -> System.out.println("有括号的表达式：" + x);
        
        sayHello1.sayMesage("hello");
        sayHello2.sayMesage("hello");
    }
    
    interface SayHello
    {
        void sayMesage(String message);
    }
}
