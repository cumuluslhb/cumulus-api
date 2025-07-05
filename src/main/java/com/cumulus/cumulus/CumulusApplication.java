package com.cumulus.cumulus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.cumulus.cumulus.mapper") // 扫描MyBatis Mapper接口
public class CumulusApplication {

    public static void main(String[] args) {

        SpringApplication.run(CumulusApplication.class, args);
        System.out.println("cumulus api 启动成功！");
    }

}    