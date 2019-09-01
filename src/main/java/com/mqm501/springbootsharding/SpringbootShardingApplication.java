package com.mqm501.springbootsharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan({ "com.mqm501.springbootsharding.*.mapper"})
public class SpringbootShardingApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootShardingApplication.class, args);
  }

}
