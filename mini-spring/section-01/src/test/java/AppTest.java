import org.spring.BeanDefinition;
import org.spring.BeanFactory;

/**
 * @description:
 * @author: wzh
 * @date: 2023/4/20 17:12
 */
public class AppTest {

    public static void main(String[] args) {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloService());
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        // 3.获取bean
        HelloService userService = (HelloService) beanFactory.getBean("helloService");
        userService.say();
    }
}
