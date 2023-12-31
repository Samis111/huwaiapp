package it.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("it.cn.mapper")
public class HuwaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuwaiApplication.class, args);
    }



}
