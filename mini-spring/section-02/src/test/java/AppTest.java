import org.spring.config.BeanDefinition;
import org.spring.support.DefaultListableBeanFactory;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/20 17:12
 */
public class AppTest {

    public static void main(String[] args) {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        // 3.第一次获取 bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.say();

        // 4.第二次获取 bean from Singleton
        HelloService helloServiceSingleton = (HelloService) beanFactory.getSingleton("helloService");
        helloServiceSingleton.say();
    }
}
