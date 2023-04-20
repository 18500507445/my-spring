package org.spring;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/20 17:12
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
