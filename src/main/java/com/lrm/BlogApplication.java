package com.lrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {

        SpringApplication.run(BlogApplication.class, args);
        System.out.println("服务程序已经启动");
        System.out.println("重新进行初始化");
    }

}
