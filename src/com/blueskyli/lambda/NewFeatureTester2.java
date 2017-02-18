package com.blueskyli.lambda;

/**
 * @Description: lambda
 * @author Jack
 * @date 2017��1��7�� ����3:25:56
 */
public class NewFeatureTester2
{
    public static void main(String[] args)
    {
        SayHello sayHello1 =x->System.out.println("û�����ŵı��ʽ��"+x);
        SayHello sayHello2 = (x) -> System.out.println("�����ŵı��ʽ��" + x);
        
        sayHello1.sayMesage("hello");
        sayHello2.sayMesage("hello");
    }
    
    interface SayHello
    {
        void sayMesage(String message);
    }
}
