package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppBeanConfig
 *
 * @author: Xugang Song
 * @create: 1/3/21
 */
@Configuration
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
