package swhd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author null
 * 2021/5/5
 * 15:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(CloudAlibabaProviderApplication.class, args);
    }


}
