package com.yiqing.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 1. 开启服务注册与发现
 * 2. 配置服务注册地址
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallGatewayApplication.class, args);
	}

}
