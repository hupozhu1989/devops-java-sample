package io.kubesphere.devops;


import io.kubesphere.config.ServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    private  final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    @Autowired
    private ServerConfig serverConfig;

    @RequestMapping("/")
    public String sayHello() {
        logger.info("请求来了。。。");
        return "power of our life...返回地址>>> "+serverConfig.getUrl();
    }

    public String sayHello2() {
        return "Really appreciate your star, that's the power of our life.";
    }
}
