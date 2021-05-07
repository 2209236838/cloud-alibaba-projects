package swhd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author null
 * 2021/5/6
 * 17:15
 */


@EnableSwagger2
@Configuration
public class Swagger2Config {

    @Bean
    public Docket createDocket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .build();
        return docket;
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("文档测试")
                .description("测试前后端分离接口文档")
                .version("1.0")
                .contact("swhd")
                .build();
    }
}
