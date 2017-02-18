package com.blueskyli.methodReferences;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: �������� 
 * �������õ�Ψһ��;��֧��lambda���ʽ�ļ�д
 * �������ý�����Lambda�����׷�����ҪĿ����ͨ�����������Lambda���ظ��������еķ���
 * �������÷�Ϊ����
 * 1�����þ�̬����
 *      ����: String::valueOf����Ӧ��Lambda��(s) -> String.valueOf(s) 
 * 2���������Զ����ʵ������
 *      ����: x::toString����Ӧ��Lambda��() -> this.toString() 
 * 3�������ض����͵���������ʵ��
 *      ����: String::toString����Ӧ��Lambda��(s) -> s.toString() 
 * 4�����ù��캯��
 *      ����: String::new����Ӧ��Lambda��() -> new String() 
 * @author Jack
 * @date 2017��1��7�� ����3:41:16
 */
public class Demo1
{
    
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("jack1");
        list.add("jack2");
        list.add("jack3");
        list.add("jack4");
        list.add("jack5");
        list.add("jack6");
        
        list.forEach(System.out::println);
        
        list.forEach(x -> System.out.println(x));
        

    }
    
}
