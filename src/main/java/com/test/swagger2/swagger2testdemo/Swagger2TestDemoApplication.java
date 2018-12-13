package com.test.swagger2.swagger2testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //表示开启Swagger
public class Swagger2TestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Swagger2TestDemoApplication.class, args);
    }
}
//启动后访问地址 http://localhost:80/swagger-ui.html