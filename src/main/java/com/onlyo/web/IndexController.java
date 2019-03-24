package com.onlyo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController注解是表示该类中的所有方法返回json格式
 * @RestController = @Controller + @ResponseBody
 * @EnableAutoConfiguration 自动配置  注解作用：扫包范围默认是当前类里面
 * @ComponentScan 指定扫包范围
 *
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        System.out.println("FirstSpringBootMavenDemo! ");
        return "Hello";
    }
}
