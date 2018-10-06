package com.sf.provider.services;
import com.alibaba.dubbo.config.annotation.Service;
import com.sf.services.DubboService;

/**
 * @ClassName DubboServiceImpl
 * @Description
 * @Author 01371059
 * @Date 2018/10/6 下午10:49
 * @Version 1.0
 **/
@Service(
        version = "${dubbo.application.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello() {
        return "hello world!";
    }
}
