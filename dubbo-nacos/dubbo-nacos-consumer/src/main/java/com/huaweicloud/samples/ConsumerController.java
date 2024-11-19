package com.huaweicloud.samples;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @DubboReference(interfaceClass = HelloService.class)
    private HelloService helloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return helloService.sayHello();
    }
}
