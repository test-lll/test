package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.bw.mapper")
public class MigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MigrationApplication.class);
    }

}
