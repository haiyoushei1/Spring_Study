package Java_AOP;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
/*
@pointcut+空函数的方式可以将切点统一，避免每个通知都要写
execution中是*，，**写的时候会无法匹配，*代表任意返回值，空格后跟包名，类名，方法名，()括号内..标识任意参数
其中空函数无所谓，方法名也无所谓，名字就起了个标识的作用
@After 优先于@AfterReturning与@AfterThrowing，猜测可以把关闭资源的代码放在这里(书上介绍的不多，不知道实用性怎么样)
如果切点的函数当时解决了异常，那不会处罚@AferThrowing通知
 */
/*
创建循环通知时使用ProceedingJoinPoint参数，通过这个类的proceed()方法，可以将控制权由切面交还给被通知的方法。
如果不加就单跑通知了，不会执行切点函数。
 */

@Aspect
public class Audience {
    @Pointcut("execution(* Java_AOP.Performance.perform(..))")
    public void performance(){};

//    @Before("performance()")
//    public void silenceCellPhones(){
//        System.out.println("Silencing cell phones");
//    }
//    @AfterReturning("performance()")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP");
//    }
//    @AfterThrowing("performance()")
//    public void demandRefound(){
//        System.out.println("Demanding");
//    }
//    @After("performance()")
//    public void donotKnow(){
//        System.out.println("I donot know");
//    }
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phones");
            //jp.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Demanding");
        }
    }
}
