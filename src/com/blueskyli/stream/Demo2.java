package com.blueskyli.stream;

/**
 * @Description: 集合是我们平时在进行Java编程时非常常用的API，使用Stream可以帮助更好的来操作集合。
 * 
 *               这些操作又可以分为中间操作和终端操作，中间操作会返回一个流，因此我们可以使用多个中间操作来作链式的调用，
 * 
 *               当使用了终端操作之后，那么这个流就被认为是被消费了， 每个流只能有一个终端操作。
 * 
 *               http://www.importnew.com/24300.html
 * @author Jack
 * @date 2017年7月23日 上午1:43:18
 */
public class Demo2
{
    /**
     * 操作   类型  返回类型    使用的类型/函数式接口 函数描述符
        filter  中间  Stream<T>   Predicate<T>    T -> boolean
        distinct    中间  Stream<T>       
        skip    中间  Stream<T>   long    跳过
        limit   中间  Stream<T>   long    截取stream前N个元素
        map 中间  Stream<R>   Function<T,R>   T -> R
        flatMap 中间  Stream<R>   Function<T, Stream<R>>  T -> Stream<R>
        sorted  中间  Stream<R>   Comparator<T>   (T,T) -> int
        anyMatch    终端  boolean Predicate<T>    T -> boolean
        noneMatch   终端  boolean Predicate<T>    T -> boolean
        allMatch    终端  boolean Predicate<T>    T -> boolean
        findAny 终端  Optional<T>     
        findFirst   终端  Optional<T>     
        forEach 终端  void    Consumer<T> T -> void
        collect 终端  R   Collector<T,A,R>    
        reduce  终端  Optional<T> BinaryOperator<T>   (T,T) -> T
        count   终端  long        
     */
}
