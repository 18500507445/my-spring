package org.spring.support;


import org.spring.config.BeanDefinition;

/**
 * @description: bean定义注册
 * @author: wzh
 * @date: 2023/4/20 17:12
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
