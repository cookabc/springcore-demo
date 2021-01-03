package com.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * MySpringBean
 *
 * @author: Xugang Song
 * @create: 1/3/21
 */
public class MessageService implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String message;

    public void sendMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    /**
     * Implement setBeanName method from {@link BeanNameAware}
     */
    @Override
    public void setBeanName(String s) {
        System.out.println("--- setBeanName executed ---");
    }

    /**
     * Implement setApplicationContext method from {@link ApplicationContextAware}
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("--- setApplicationContext executed ---");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("--- @PostConstruct executed ---");
    }

    /**
     * Implement afterPropertiesSet method from {@link InitializingBean}
     */
    @Override
    public void afterPropertiesSet() {
        System.out.println("--- afterPropertiesSet executed ---");
    }

    /**
     * customer init method
     */
    public void initMethod() {
        System.out.println("--- custom init-method executed ---");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("--- @PreDestroy executed ---");
    }

    /**
     * Implement destroy method from {@link DisposableBean}
     */
    @Override
    public void destroy() {
        System.out.println("--- destroy executed ---");
    }

    /**
     * customer destroy method
     */
    public void destroyMethod() {
        System.out.println("--- custom destroy-method executed ---");
    }

}
