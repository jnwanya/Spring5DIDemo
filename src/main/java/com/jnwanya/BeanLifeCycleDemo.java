package com.jnwanya;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
@Component
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean, BeanNameAware,
                                           BeanFactoryAware, ApplicationContextAware {

    public BeanLifeCycleDemo() {
        System.out.println("I am a Lifecycle bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("The Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("The Bean name is "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The Bean Lifecycle has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" The Bean Lifecycle has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("The application context has been set now");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("The post construct annotted method has been called");
    }

    @PreDestroy
    public void preConstruct(){
        System.out.println("The pre destroy annotted method has been called");
    }

    public void beforeInit(){
        System.out.println("## BeforeInit: Called by the bean post processor");
    }

    public void afterInit(){
        System.out.println("## AfterInit: Called by the bean post processor");
    }
}
