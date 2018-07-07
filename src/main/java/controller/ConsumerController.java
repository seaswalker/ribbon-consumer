package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 测试用接口.
 *
 * @author skywalker
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consume", method = RequestMethod.GET)
    public String consume() {
        // 请求hello-service服务
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }

}
