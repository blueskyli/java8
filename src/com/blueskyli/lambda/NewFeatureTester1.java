package com.blueskyli.lambda;

public class NewFeatureTester1
{
    /**
     * 
     * @Description: lambda���ʽ����
     *  lambda�����������
     *  1���������ɶ��ŷָ���β�
     * 2��һ����ͷ����
     * 3��������
     * ������
     * 1����ѡ����������������Ҫ�Լ��������������ͣ��༭�������Զ�ʶ��
     * 2����ѡ�Ĳ������ţ����ڵ��������ķ������Բ������ţ����������Ҫ�������
     * 3�����ʽ��ѡ�Ĵ����ţ����ʽ�������ֻ��һ����䣬��ô�����ſ�������
     * 4����ѡ�ķ��عؼ��֣�������ʽ��ֻ�е������ʽ���ڷ��أ���ôʡ��return �ʹ����ţ�
     *      ����Ҫָ�����ʽ����ĳ���ض���ֵ
     * @author Jack
     * @date 2017��1��7�� ����3:17:54
     *
     * @param arg
     */
    public static void main(String arg[])
    {
        NewFeatureTester1 tester = new NewFeatureTester1();
        
        // �������������ı��ʽ
        MathOperation addtion = (int a, int b) -> a + b;
        
        // û�����������ı��ʽ
        MathOperation subtraction = (a, b) -> a - b;
        
        // �������źͷ���ֵ�ı��ʽ
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        
        // û�����źͷ���ֵ�ı��ʽ
        MathOperation division = (int a, int b) -> a / b;
        
        // ������
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