package com.studycloud1.spittr.config;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {  // 设置业务逻辑，数据层配置文件？
        return new Class[] {RootConfig.class};  // 返回带有@Configuration注解用来配置ContextloaderListener的应用上下文bean
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {  // 设置控制器，页面解析器，处理器映射的配置文件
        return new Class[] {WebConfig.class};  // // 返回带有@Configuration注解用来配置DispatcherServlet的应用上下文bean
    }

    @Override
    protected String[] getServletMappings() {  // 配置DispatcherServlet的映射路径
        System.out.println("====sssss=====");
        return new String[] {"/"};
    }
}
