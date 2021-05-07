package swhd;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author null
 * 2021/5/5
 * 15:19
 */
@SpringBootApplication
//激活nacos服务注册
@EnableDiscoveryClient
//激活feign客户端
@EnableFeignClients
@EnableSwagger2
@EnableKnife4j
public class CloudAlibabaConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(CloudAlibabaConsumerApplication.class, args);
    }
}
