package com.hzj.learningplatform.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.hzj.learningplatform.system.mapper"})
public class DataSourceConfig {
}
