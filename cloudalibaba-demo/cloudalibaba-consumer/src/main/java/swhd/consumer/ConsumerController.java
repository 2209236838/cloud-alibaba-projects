package swhd.consumer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import swhd.feign.ConsumerFeign;

import javax.annotation.Resource;

/**
 * @author null
 * 2021/5/5
 * 15:21
 */
@RestController
@Api(tags = "消费者测试类接口")
public class ConsumerController {

    @Resource
    private ConsumerFeign consumerFeign;

    @GetMapping("/test")
    @ApiOperation(value = "方法一测试")
    public String test(){
        return "consumer-----服务提供者";
    }

    @GetMapping("/test1")
    @ApiOperation(value = "方法二测试")
    @ApiImplicitParam(required = true,value = "年龄",dataType = "String",name = "age")
    public String test1(String age){
        String index = consumerFeign.index();
        return index + "-----通过feign调用远程服务-----" + age;
    }
}
