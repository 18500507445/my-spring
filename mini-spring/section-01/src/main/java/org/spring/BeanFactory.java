package org.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: bean工厂
 * @author: wzh
 * @date: 2023/4/20 17:11
 */
public class BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
