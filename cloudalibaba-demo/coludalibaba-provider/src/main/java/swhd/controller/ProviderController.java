package swhd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author null
 * 2021/5/5
 * 15:15
 */
@RestController
public class ProviderController {

    @GetMapping("/index")
    public String index(){
        return "provider------服务提供者";
    }
}
