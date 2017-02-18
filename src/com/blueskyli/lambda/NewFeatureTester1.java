package com.blueskyli.lambda;

public class NewFeatureTester1
{
    /**
     * 
     * @Description: lambda表达式举例
     *  lambda有三部分组成
     *  1，括号内由逗号分割的形参
     * 2，一个箭头符号
     * 3，方法体
     * 特征：
     * 1，可选的类型申明：不需要自己申明参数的类型，编辑器可以自动识别
     * 2，可选的参数括号：对于单个参数的方法可以不加括号，多个参数需要添加括号
     * 3，表达式可选的大括号：表达式里面如果只有一个语句，那么大括号可以声落
     * 4，可选的返回关键字：如果表达式体只有单个表达式用于返回，那么省略return 和大括号，
     *      除非要指定表达式返回某个特定的值
     * @author Jack
     * @date 2017年1月7日 下午3:17:54
     *
     * @param arg
     */
    public static void main(String arg[])
    {
        NewFeatureTester1 tester = new NewFeatureTester1();
        
        // 带有类型申明的表达式
        MathOperation addtion = (int a, int b) -> a + b;
        
        // 没有类型申明的表达式
        MathOperation subtraction = (a, b) -> a - b;
        
        // 带有括号和返回值的表达式
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        
        // 没有括号和返回值的表达式
        MathOperation division = (int a, int b) -> a / b;
        
        // 计算结果
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