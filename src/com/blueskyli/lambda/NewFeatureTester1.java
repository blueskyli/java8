package com.blueskyli.lambda;

public class NewFeatureTester1
{
    /**
     * 
     * @Description: 
     * •可选的类型声明：你不用去声明参数的类型。编译器可以从参数的值来推断它是什么类型。
        •可选的参数周围的括号：你可以不用在括号内声明单个参数。但是对于很多参数的情况，括号是必需的。
        •可选的大括号：如果表达式体里面只有一个语句，那么你不必用大括号括起来。
        •可选的返回关键字：如果表达式体只有单个表达式用于值的返回，那么编译器会自动完成这一步。若要指示表达式来返回某个值，则需要使用大括号。
     * @author Jack
     * @date 2017年2月18日 下午4:00:00
     *
     * @param arg
     */
    public static void main(String arg[])
    {
        NewFeatureTester1 tester = new NewFeatureTester1();
        
        MathOperation addtion = (int a, int b) -> a + b;
        
        MathOperation subtraction = (a, b) -> a - b;
        
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        
        MathOperation division = (int a, int b) -> a / b;
        
        System.out.println("8 + 4 =" + tester.operate(8, 4, addtion));
        System.out.println("8 - 4 =" + tester.operate(8, 4, subtraction));
        System.out.println("8 * 4 =" + tester.operate(8, 4, multiplication));
        System.out.println("8 / 4 =" + tester.operate(8, 4, division));
        
        System.out.println(addtion.opreation(1, 3));
    }
    
    interface MathOperation
    {
        int opreation(int a, int b);
    }
    
    private int operate(int a, int b, MathOperation mathOperation)
    {
        return mathOperation.opreation(a, b);
    }
}