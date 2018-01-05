package com.jnwanya;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
@Component
public class CustomBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLifeCycleDemo){
            ((BeanLifeCycleDemo)bean).beforeInit();
        }
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLifeCycleDemo){
            ((BeanLifeCycleDemo)bean).afterInit();
        }
        return bean;
    }
}
