package com.hzj.learningplatform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * swagger配置类
 * @author hezhijian
 */
@Configuration
@EnableSwagger2
public class Knife4jConfiguration {

    @Bean
    public Docket systemApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("系统模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hzj.learningplatform.system"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket blogApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("博客模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hzj.learningplatform.blog"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("学习平台")
                .build();
    }
}
