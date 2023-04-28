package org.spring.config;

/**
 * @description: 单例bean注册
 * @author: wzh
 * @date: 2023/4/20 17:12
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
