package swhd.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author null
 * 2021/5/5
 * 15:24
 */
@FeignClient(name = "coludalibaba-provider")
public interface ConsumerFeign {

    @GetMapping("/index")
    public String index();
}
