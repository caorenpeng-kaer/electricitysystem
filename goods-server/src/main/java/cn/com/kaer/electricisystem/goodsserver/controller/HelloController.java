package cn.com.kaer.electricisystem.goodsserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @GetMapping(value = "/echo")
    public String hello() {
        return "12312";
    }
}
