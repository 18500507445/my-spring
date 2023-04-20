package org.spring.support;


import org.spring.BeanFactory;
import org.spring.BeansException;
import org.spring.config.BeanDefinition;

/**
 * @description: BeanDefinition 注册表接口
 * @author: wzh
 * @date: 2023/4/20 17:12
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
