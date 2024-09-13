package com.yiqing.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 调用远程微服务 feign
 * 1.引入 feign
 * 2.编写接口,告诉 springcloud 这是远程调用
 * 1.声明接口的每一个方法是调用具体的哪个服务的哪个请求
 * 3.开启远程调用功能 @EnableFeignClients
 */
//@EnableFeignClients(basePackages = "com.yiqing.mall.coupon.feign")
@MapperScan("com.yiqing.mall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class);
    }
}
