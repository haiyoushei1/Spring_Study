package Java_AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/*
通过注解引入加入新功能，原理上还是切面，代理，Spring识别到@Aspect就会生成一个代理，然后将调用 委托给被代理的bean或被引用的实现(就是实现接口的类)
作用就是在不改变业务代码的基础上，加入接口的实现。
Performance+表示对所有实现Performance接口的类都进行添加。
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "Java_AOP.Performance+",
                    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
