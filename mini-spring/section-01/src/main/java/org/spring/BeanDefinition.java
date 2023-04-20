package org.spring;

/**
 * @description: bean定义
 * @author: wzh
 * @date: 2023/4/20 17:11
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
