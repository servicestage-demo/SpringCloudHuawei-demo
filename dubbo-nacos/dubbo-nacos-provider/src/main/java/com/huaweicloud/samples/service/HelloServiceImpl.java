package com.huaweicloud.samples.service;

import com.huaweicloud.samples.HelloService;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        RpcContext rpcContext = RpcContext.getServerContext();
        return String.format("Hello,I'm provider,[ip:%s , port : %d]", rpcContext.getLocalHost(),
                rpcContext.getLocalPort());
    }
}
