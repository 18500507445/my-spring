## spring-cloud学习

### 简介:
* 基于订单和支付搭建一个spring cloud alibaba项目

[Spring cloud和Alibaba版本对照](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)

[注册中心nacos服务端下载](https://github.com/alibaba/nacos)

项目中下载的2.2.2版本，导入项目中，然后添加一个shell script单节点配置
![](./img/nacos.jpg)

[启动后访问](http://192.168.1.9:8848/nacos/index.html)

服务pom添加依赖
~~~xml
springboot
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-aop</artifactId>
</dependency>

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-test</artifactId>
</dependency>

springcloud
<!-- 注册nacos -->
<dependency>
<groupId>com.alibaba.cloud</groupId>
<artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>

<!-- 远程调用openfeign -->
<dependency>
<groupId>org.springframework.cloud</groupId>
<artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

<!-- 负载均衡loadbalancer -->
<dependency>
<groupId>org.springframework.cloud</groupId>
<artifactId>spring-cloud-starter-loadbalancer</artifactId>
</dependency>
~~~

orderService需要用到payService的接口，pom引入payService依赖，orderService创建biz目录
~~~java
@FeignClient("payService")
public interface PayOrderClient {

    @RequestMapping("/api/getPayOrder/{id}")
    PayOrder getPayOrder(@PathVariable("id") Long id);
}
~~~

OrderApplication添加@EnableFeignClients注解开启远程调用