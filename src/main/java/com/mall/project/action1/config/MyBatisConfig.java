package com.mall.project.action1.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis 配置类
 *
 */

@Configuration
@MapperScan("com.mall.project.action1.mbg.mapper")
public class MyBatisConfig {

}
