package com.springcore;

import org.springframework.context.annotation.Bean;

/**
 * AppBeanConfig
 *
 * @author: Xugang Song
 * @create: 1/3/21
 */
public class AppConfig {

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MessageService messageService() {
        return new MessageService();
    }

}
