package com.blueskyli.optional;

import java.util.Optional;

/**
 * @Description:Optional 这是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
 * 
 *                       http://www.importnew.com/6675.html
 * @author Jack
 * @date 2017年7月23日 上午12:18:03
 */
public class Demo1
{
    public static void main(String[] args)
    {
        // demo_of();
        // demo_ofNullable();
        // demo_isPresent();
        demo_ifPresent();
        // demo_orElse();
        // demo_orElseGet();
        // demo_orElseThrow();
        // demo_map();
        // demo_flatMap();
        // demo_filter();
    }

    /**
     * 
     * @Description: 如果有值并且满足断言条件返回包含该值的Optional，否则返回空
     * @author Jack
     * @date 2017年7月23日 上午1:07:54
     *
     */
    private static void demo_filter()
    {
        Optional<String> name = Optional.of("hello a");
        Optional<String> filter = name.filter(x -> x.length() > 10);
        System.out.println(filter.orElse("length太少了"));
    }
    
    /**
     * 
     * @Description: 如果有值，为其执行mapping函数返回Optional类型返回值，否则返回空Optional。flatMap与map（Funtion）方法类似，区别在于flatMap中的mapper返回值必须是Optional。调用结束时，flatMap不会对结果用Optional封装
     * @author Jack
     * @date 2017年7月23日 上午1:03:14
     *
     */
    private static void demo_flatMap()
    {
        Optional<String> name = Optional.of("hello a 我是有值的");
        Optional<String> flatMap = name.flatMap(x -> Optional.of("hello a I am a new value"));
        System.out.println(flatMap.orElse("我可能没有值哦"));
    }
    
    /**
     * 
     * @Description: 如果有值，则对其执行调用mapping函数得到返回值。
     * 
     *               如果返回值不为null，则创建包含mapping返回值的Optional作为map方法返回值 ，否则返回空Optional。
     * @author Jack
     * @date 2017年7月23日 上午12:55:23
     *
     */
    private static void demo_map()
    {
        Optional<String> name = Optional.of("hello a 我是有值的");
        Optional<String> map = name.map(x -> x = "hello a I am a new value");
        System.out.println(map.orElse("我可能没有值哦"));
    }

    /**
     * 
     * @Description: 如果有值则将其返回，否则抛出supplier接口创建的异常。
     * @author Jack
     * @date 2017年7月23日 上午12:48:22
     *
     */
    private static void demo_orElseThrow()
    {
        Optional<String> name1 = Optional.ofNullable(null);
        try
        {
            name1.orElseThrow(NullPointerException::new);
        }
        catch(Throwable e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * 
     * @Description: orElseGet与orElse方法类似，区别在于得到的默认值。
     * 
     *               orElse方法将传入的字符串作为默认值，
     * 
     *               orElseGet方法可以接受Supplier接口的实现用来生成默认值。
     * @author Jack
     * @date 2017年7月23日 上午12:42:39
     *
     */
    private static void demo_orElseGet()
    {
        Optional<String> name1 = Optional.ofNullable(null);
        Optional<String> name2 = Optional.ofNullable("name2不是空值");
        System.out.println(name1.orElseGet(() -> "name1没有值啊，所以我返回来了"));
        System.out.println(name2.orElseGet(() -> "不知道有没有值"));
    }
    
    /**
     * 
     * @Description: 如果有值则将其返回，否则返回指定的其它值。
     * @author Jack
     * @date 2017年7月23日 上午12:39:08
     *
     */
    private static void demo_orElse()
    {
        Optional<String> name1 = Optional.ofNullable(null);
        Optional<String> name2 = Optional.ofNullable("name2不是空值");
        System.out.println(name1.orElse("name1没有值啊，所以我返回来了"));
        System.out.println(name2.orElse("不知道有没有值"));
    }
    
    /**
     * 
     * @Description: 如果Optional实例有值则为其调用consumer，否则不做处理
     * @author Jack
     * @date 2017年7月23日 上午12:33:32
     *
     */
    private static void demo_ifPresent()
    {
        // Consumer类包含一个抽象方法。该抽象方法对传入的值进行处理，但没有返回值。
        Optional<String> name1 = Optional.ofNullable("hello a ");
        Optional<String> name2 = Optional.ofNullable(null);
        name1.ifPresent(x -> {
            System.out.println("name1的值为：" + x);
        });
        name2.ifPresent(x -> System.out.println(x));
    }
    
    /**
     * 
     * @Description: 如果值存在返回true，否则返回false
     * @author Jack
     * @date 2017年7月23日 上午12:28:43
     *
     */
    private static void demo_isPresent()
    {
        Optional<String> name1 = Optional.ofNullable(null);
        Optional<String> name2 = Optional.ofNullable("name2不是空值");
        if(name1.isPresent())
            System.out.println(name1.get());
        else
            System.out.println("name1为空");
        if(name2.isPresent())
            System.out.println(name2.get());
        
    }
    
    /**
     * 
     * @Description: 为指定的值创建一个Optional，如果指定的值为null，则返回一个空的
     * @author Jack
     * @date 2017年7月23日 上午12:22:56
     *
     */
    private static void demo_ofNullable()
    {
        Optional<String> name1 = Optional.ofNullable(null);
        System.out.println(name1);
    }
    
    /**
     * 
     * @Description: 为非null的值创建一个Optional。
     * @author Jack
     * @date 2017年7月23日 上午12:22:46
     *
     */
    private static void demo_of()
    {
        // 调用工厂方法创建Optional实例
        Optional<String> name = Optional.of("hello a, I am a demo");
        System.out.println(name.get());
        
        // 如果入参为null 则抛出空指针异常
        Optional<String> name1 = Optional.of(null);
        System.out.println(name1);
    }
}
