package com.h3c.solution.smmworkflowserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//是入口模块，需要配置 spring boot。由于我们使用了Spring Boot的依赖注入功能，所以我们需要在入口类上加上注解指明要IOC要扫描的包范围
@ComponentScan(value = "com.h3c.solution")
@SpringBootApplication
public class SmmWorkflowServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmmWorkflowServerApplication.class, args);
	}
}
