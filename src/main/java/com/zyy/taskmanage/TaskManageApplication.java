package com.zyy.taskmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyy.taskmanage.dao")
public class TaskManageApplication {

    public static void main(String[] args){
        SpringApplication.run(TaskManageApplication.class,args);
    }

}
