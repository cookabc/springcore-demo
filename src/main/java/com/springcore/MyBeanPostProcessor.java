package com.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * MyBeanPostProcessor
 *
 * @author: Xugang Song
 * @create: 1/3/21
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MessageService) {
            System.out.println("--- postProcessBeforeInitialization executed ---");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MessageService) {
            System.out.println("--- postProcessAfterInitialization executed ---");
        }
        return bean;
    }

}
