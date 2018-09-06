package org.white.mutidatasource2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.white.mutidatasource2.dao")
public class Mutidatasource2Application {

    public static void main(String[] args) {
        SpringApplication.run(Mutidatasource2Application.class, args);
    }
}
