package learncode.lambdalearn;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @Author yangxin8@asiainfo.com
 * @Date 2020/10/18 11:15
 * @Version 1.0
 *
 * Predicate<T> T boolean 这张唱片发行了吗
 * Consumer<T>  T void  输出一个值
 * Function<T,R>    T R 获得Artist对象的名字
 * Supplier<None>   None 工厂方法
 * UnaryOperator<T> T T 逻辑非(!)
 * BinaryOperator<T> (T,T)  T 求两个数的乘积
 */
public class PuttingIntoPractice{
    BinaryOperator<Long> addLongs = (x,y)->x+y;
}
