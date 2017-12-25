package io.tooko.sboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.tooko.sboot.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @RequestMapping("/{str}")
    public String test1(@PathVariable("str") String str) {
        echoService.echo(str);
        return str;
    }

}
