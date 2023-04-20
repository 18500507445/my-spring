package org.spring;

/**
 * @description: 定义Bean异常
 * @author: wzh
 * @date: 2023/4/20 17:12
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
