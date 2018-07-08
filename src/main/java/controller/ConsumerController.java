package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

import javax.annotation.Resource;

/**
 * 测试用接口.
 *
 * @author skywalker
 */
@RestController
public class ConsumerController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/ribbon-consume", method = RequestMethod.GET)
    public String consume() {
        return helloService.hello();
    }

}
